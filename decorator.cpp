#include<iostream>

using namespace std;

class DataSource {
public:
    virtual void writeData(const char* msg) {};
    virtual const char* readData() {return 0;};
};

class FileDataSource : public DataSource {
private:
    //FileDatasource don't need to enhance feature, 
    //so it's dont't need to wrap.
    const char* filename;
public:

    FileDataSource(const char* filename) {
        if (filename != 0) {
            this->filename = filename;
        }
    }

    virtual void writeData(const char* msg) {
        cout << "Data is written to file '\n";
    }

    virtual const char* readData() {
        cout << "Data is read from file '\n";
        return 0;
    }
};

class DataSourceDecorator : public DataSource {
protected:
    DataSource* wrappe; //When class of wraper need to be wrapped
public:
    DataSourceDecorator(DataSource* dataSource) {
        //cout << "DataSourceDecorator constructor '\n";
        this->wrappe = dataSource;
    }

    virtual void writeData(const char* msg) {
        //cout << "DataSourceDecorator write data \n";
    }

    virtual const char* readData() {
        //cout << "DataSourceDecorator read data \n";
        return 0;
    }
};


class EncrypionDecorator : public DataSourceDecorator {
public:
    EncrypionDecorator(DataSource* source) : DataSourceDecorator(source){
        //cout << "EncryptionDecorator constructor '\n";
    }

    virtual void writeData(const char* msg) {
        cout << "Data is encrypted \n";
        this->wrappe->writeData(msg);
    }

    virtual const char*  readData() {
        cout << "Data is decryped \n";
        this->wrappe->readData();
        return 0;
    }
};

class CompressionDecorator : public DataSourceDecorator {
public:
    CompressionDecorator(DataSource* source) : DataSourceDecorator(source) {
        //cout << "CompressionDecorator constructor \n";
    }
    virtual void writeData(const char* msg) {
        cout << "Data is compressed \n";
        this->wrappe->writeData(msg);
    }

    virtual const char*  readData() {
        cout << "Data is depressed\n";
        this->wrappe->readData();
        return 0;
    }
};

//Option 1:
class Application {
private:
    DataSource* source;
public:
    void foo_write(const char* data) {
        //Plain text:
        cout << ">> Write plaint text '\n";
        this->source = new FileDataSource("File.dat");
        this->source->writeData(data);
        cout << '\n';

        //Compressed data:
        cout << ">> Write plaint text with compression '\n";
        this->source = new CompressionDecorator(source);
        this->source->writeData(data);
        cout << '\n';

        //Encrypted data:
        cout << ">> Write plaint text with compression and encryption \n";
        this->source = new EncrypionDecorator(source);
        this->source->writeData(data);
        cout << '\n';
    }

    void foo_read() {
        this->source->readData();
    }
};

class SalaryManager {
private:
    DataSource* source; 
public:
    SalaryManager(DataSource* source) {
        this->source  = source;
    }

    const char* load() {
        return this->source->readData();
    }

    void save(const char* msg) {
        this->source->writeData(msg);
    }
};


class ApplicationConfigurator {
private:
    DataSource* source;
    SalaryManager* logger;
public:
    ApplicationConfigurator() {
        this->source = NULL;
        this->logger = NULL;
    }

    void configureExample(bool enEncrypt, bool enComp) {
        source = new FileDataSource("File.dat");
        if (enEncrypt) {
            source = new EncrypionDecorator(source);
        }
        if (enComp) {
            source = new CompressionDecorator(source);
        }

        logger = new SalaryManager(source);
        logger->save("foo");
    }
};

int main() {
    // ApplicationConfigurator app;
    // app.configureExample(true, true);
    Application app;
    app.foo_write("foo");
}