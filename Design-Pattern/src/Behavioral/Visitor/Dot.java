package Behavioral.Visitor;

public class Dot implements Shape{

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    } 
}
