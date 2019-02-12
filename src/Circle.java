public class Circle extends Shape {
    private int r;
    double pi=3.14;

    public Circle(int r,String name){

        super (name);
        this.r=r;
    }

    @Override
    public void draw() {

        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return ((pi*r*r)/2);

    }
}
