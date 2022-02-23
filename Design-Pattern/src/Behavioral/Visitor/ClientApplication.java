package Behavioral.Visitor;

public class ClientApplication {
    public void main() {
        //Initialize external function's object
        XMLExportVisitor visitor = new XMLExportVisitor();
        //Initialize object
        Dot dot = new Dot();
        Circle circle = new Circle();
        //Export XML for each opject
        dot.accept(visitor);
        circle.accept(visitor);
    }
}
