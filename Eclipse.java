public class Eclipse extends Shape{

    public Eclipse(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        System.out.println("Inside Area for Eclipse.");
        return this.pi * this.dim1 * this.dim2;
    }
}
