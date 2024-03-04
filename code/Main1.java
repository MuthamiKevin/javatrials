package code;

public class Main1 {
    public static void main(String[]args){
        Rectangle rect1 = new Rectangle(7, 9);

    System.out.println("the area of rect1 is: " + rect1.getArea());
    System.out.println("the perimeter of rect1 is: " + rect1.getPerimeter());
    

    rect1.setWidth(10);
    rect1.setLength(15);

    System.out.println("the area of rect1 is now: " + rect1.getArea());
    System.out.println("the perimeter of rect1 is now: " + rect1.getPerimeter());
    


    }
    
}
