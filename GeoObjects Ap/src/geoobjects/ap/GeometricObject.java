
package geoobjects.ap;

//specify class as abstract (contains variables and method signatures for its children)
public abstract class GeometricObject { 
    
    private String color;
    private boolean filled;

    //general constructor - default
    public GeometricObject() {
    }

    //constructor - sets the color and filled to whatever the object is instantiated to
    //constructs a geometric object
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    //getter for the color - returns the color
    public String getColor() {
        return color;
    }

    //setter for the color - sets the color
    public void setColor(String color) {
        this.color = color;
    }

    //getter for the filled variable - returns a bool
    public boolean isFilled() {
        return filled;
    }

    //setter for the filled variable - sets the filled property
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    //These methods are relevant to all children and need to be overridden
    
    
    public abstract double findArea(); // finds the area of a shape
    
    public abstract double findPerimeter(); //finds the perimiter of a shape
}
