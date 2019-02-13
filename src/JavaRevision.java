public class JavaRevision {

public static void main (String [] args){

   System.out.print ("Hello world");
    Shape rect = new Rectangle(2,3, "Rectangle");
    System.out.println("Area of rectangle: " + rect.area());
    rect.moveTo(1,2);

    System.out.println(" ");

    // creating the Objects of circle class
    Shape circle = new Circle(2, "Cicle");
    System.out.println("Area of circle: " + circle.area());
    circle.moveTo(5,4);

    }

}
