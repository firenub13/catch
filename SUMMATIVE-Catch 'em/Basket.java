import greenfoot.*;
public class Basket extends Actor
{
   
    //Basket constructor
        //code that is run ONCE when the this actor is added to the world
    public Basket()
    {
        
        
    }
    
    //declare variables below here
    
    //act method - loops when the run button is pressed
    public void act()
    {
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+10, getY());
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-10, getY());
        }
    }
}
