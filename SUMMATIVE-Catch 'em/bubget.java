import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bubget here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bubget extends Actor
{
    /**
     * Act - do whatever the bubget wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+3);
        if (getY()>745){
            MyWorld.misses++;
            getWorld().removeObject(this);
        }else if (isTouching(Basket.class)){
            MyWorld.score++;
            getWorld().removeObject(this);
        }
    }
}
