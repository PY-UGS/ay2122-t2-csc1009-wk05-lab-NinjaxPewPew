

public abstract class Shape {
    protected double dim1;
    protected double dim2;
    protected final double pi = 3.14;

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;

    }

    public abstract double area();

    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Eclipse e = new Eclipse(7,7);
        Square s = new Square(6,6);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());



    }
}
