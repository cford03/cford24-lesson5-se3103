package model;

public class MyShape {

    public double x;
    public double y;

    public MyShape(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy ){
        this.x += dx;
        this.y += dy;
    }


    public double getArea(){
        return -1;
    }

}