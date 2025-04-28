import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound cheering = new GreenfootSound("cheering.mp3");
    GreenfootSound jockey = new GreenfootSound("jockey.mp3");
    int chickenDone = 0;
    int chickenStarted = 0;
    static int score = 0;
    static int misses = 0;
    //Constructor for the MyWorld
        //code that is run when the program starts
    public MyWorld()
    {    
        // Create a new world with 1000x751 cells with a cell size of 1x1 pixels.
        super(1000, 751, 1);
        
        addObject(new Basket(), 500, 700);
    }
    
    //act method - loops when the run button is pressed
    public void act(){
        //add actors here
        if (score > 9){
            setBackground("promotion.png");
            removeObjects(getObjects(null));
            Greenfoot.stop();
        }else if (misses > 9){
            setBackground("fired.png");
            removeObjects(getObjects(null));
            Greenfoot.stop();
        }
        
        if (chickenDone == 1){
            if (Greenfoot.getRandomNumber(100)==1){
                addObject(new bobgorn(), 1+Greenfoot.getRandomNumber(998), 0);
            }
            if (Greenfoot.getRandomNumber(1200)==1){
                addObject(new child(), 1+Greenfoot.getRandomNumber(998), 0);
            }
            if (Greenfoot.getRandomNumber(300)==1){
                addObject(new bubget(), 1+Greenfoot.getRandomNumber(998), 0);
            }
            if (Greenfoot.getRandomNumber(600)==1){
                addObject(new chimken(), 1+Greenfoot.getRandomNumber(998), 0);
            }
            if (Greenfoot.getRandomNumber(100)==1){
                addObject(new gaborn(), 1+Greenfoot.getRandomNumber(998), 0);
            }
    }
        if (chickenStarted == 0){
            chickenStarted = 1;
            jockey.play();
        }
        if (jockey.isPlaying()){
            chickenDone = 0;
        }else{
            chickenDone = 1;
        }
        
        if (chickenDone == 1){
            cheering.play();
        }
    }
}
