package Behavioral.Visitor;

public class XMLExportVisitor implements Visitor{

    @Override
    public void visitDot(Dot d) {
        // TODO Auto-generated method stub
        System.out.println("Export XML file for Dot");
    }

    @Override
    public void visitCircle(Circle c) {
        // TODO Auto-generated method stub
        System.out.println("Export XML file for Circle");
    }
}
