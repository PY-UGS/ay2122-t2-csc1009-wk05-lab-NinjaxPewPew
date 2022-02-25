public class RectangleFromSimpleGeometricObject extends GeometricObject{
    double width;
    double  height;

    public RectangleFromSimpleGeometricObject(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }


}
