public class Rectangle extends Shape{

    private int length,width;

    //constructor
    public Rectangle (int length,int width,String name){

        super(name);
        this.length=length;
        this.width=width;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area()
    {
        return (double)(length*width);
    }
}
