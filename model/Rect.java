package model;

public class Rect extends MyShape {
    public double width;
    public double height;

    public Rect(double width, double height){
        this(0,0, width, height);
    }

    public Rect(double x, double y, double width, double height){
        super(x, y);
        this.width= width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    public String toString(){
        return String.format("Rect@[%.1f, %.1f] w=%.1f h%.1f", x, y, width, height);
    }
}
