import java.util.Date;


public class GeometricObject {

    protected String color;
    protected boolean filled;
    public Date dateCreated; 
    
    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;

    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;

    }
    public Date getDateCreated(){
        return this.dateCreated;
    }

    public String ToString(){
        return "created on " + this.getDateCreated() + "\ncolor: " + this.getColor() + " and filled: " + this.isFilled();
    }
}
