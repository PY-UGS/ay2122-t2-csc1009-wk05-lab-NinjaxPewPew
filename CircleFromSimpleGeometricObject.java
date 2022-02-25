public class CircleFromSimpleGeometricObject extends GeometricObject{
    double radius;

    public CircleFromSimpleGeometricObject(){
        super();
    }

    public CircleFromSimpleGeometricObject(double radius){
        super();
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);

    }

    public double getPerimeter(){
        return Math.PI * (this.radius * 2);
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    public void printCirlce(){
        System.out.print("The color is " + this.getColor() + "\nThe radius is " + this.getRadius() + "\nThe area is " + this.getArea() + "\nThe diameter is " + this.getDiameter());
    }

   
}
