import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PC1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PC1 extends Actor
{
    /**
     * Act - do whatever the PC1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(100,100);
        
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(180);
    }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
    }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
    }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(270);
    }
    }    
    
    
}
