import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cream3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cream3 extends Actor
{
    /**
     * Act - do whatever the cream3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x-1,y);     //move left
    }    
}
