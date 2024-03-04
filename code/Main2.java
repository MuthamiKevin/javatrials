package code;

public class Main2 {
    public static void main(String[]args){
        Circle circle = new Circle (7);

    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The circumference of the  circle is: " + circle.getCircumference());

    circle.setRadius(14);
    
    
    System.out.println("The area of the new circle is: " + circle.getArea());
    System.out.println("The circumference of the  new circle is: " + circle.getCircumference());
    
    }
    
}
