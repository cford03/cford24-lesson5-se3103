package model;

public class Circle extends MyShape {
    
    public double radius;
    public Circle(double radius){
        this(0,0, radius);
    }

    public Circle(double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return String.format("Circle@[%.1f,%.1f] r=%.1f",x,y,radius);
    }
}
