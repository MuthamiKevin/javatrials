package code;

public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    public double getRadius(double radius){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*(radius+radius);
    }
}
