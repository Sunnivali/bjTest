
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int year;
    private String color;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        year = 2024;
        color = "white";
    }

    /**
     * Set the color of the car
     *
     * @param  col  the new color
     * @return The car color
     */
    public void setColor(String col)
    {
        color = col;
    }
    
    public String getColor()
    {
        return color;
    }  
    
    public int getYear()
    {
        return year;
    } 
}
