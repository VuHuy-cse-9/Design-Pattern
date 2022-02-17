#include<iostream>
#include<string>

using namespace std;

class Button {
public:
    virtual void render() = 0;
    virtual void onClick() = 0;
};

class WindowButton : public Button{
public:
    virtual void render() {
        cout << "Window button render\n";
    }

    virtual void onClick() {
        cout << "Window button on click\n";
    }
};

class WebButton : public Button {
public:
    virtual void render() {
        cout << "Web button render\n";
    }

    virtual void onClick() {
        cout << "Web button on click\n";
    }
};

class Dialog {
public:
    virtual Button* createButton() = 0;

    void render() {
        Button* button = createButton();
        button->onClick();
        button->render();
    }
};

class WindowDialog : public Dialog {
public:
    virtual Button* createButton() override{
        return new WindowButton();
    }
};

class WebDialog : public Dialog {
public:
    virtual Button* createButton() override{
        return new WebButton();
    }
};

class DialogFactory {
private:
    Dialog* dialog;
public:
    Dialog* createDialog(string OS) {
        if (!OS.compare("Window")) {
            dialog = new WindowDialog();
        }
        else if (!OS.compare("Web")) {
            dialog = new WebDialog();
        }
        else {
            throw "OS do not support";
        }
        return dialog;
    }
};

int main() {
    DialogFactory f;
    Dialog* dialog = f.createDialog("Web");
    dialog->render();
}