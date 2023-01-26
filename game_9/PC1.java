import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PC1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PC1 extends Actor
{
    private int fruits = 0;
    private int fruits2 = 0;
    /**
     * Act - do whatever the PC1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
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
    Actor Ichigo = getOneIntersectingObject( ichigo.class );
    Actor Ichigo2 = getOneIntersectingObject( ichigo2.class );
    Actor Ichigo3 = getOneIntersectingObject( ichigo3.class );
    Actor Ichigo4 = getOneIntersectingObject( ichigo4.class );
    Actor Cream = getOneIntersectingObject( cream.class );
    Actor Cream2 = getOneIntersectingObject( cream2.class );
    Actor Cream3 = getOneIntersectingObject( cream3.class );
    Actor Cream4 = getOneIntersectingObject( cream4.class );
    if( getRotation() == 0  &&Ichigo != null ){
            fruits++;
            getWorld().removeObject( Ichigo );
        }  
    if( getRotation() == 90  && Ichigo2 != null ){
            fruits++;
            getWorld().removeObject( Ichigo2 );
        }  
    if( getRotation() == 180 && Ichigo3 != null ){
            fruits++;
            getWorld().removeObject( Ichigo3 );
        }  
    if( getRotation() == 270  && Ichigo4 != null ){
            fruits++;
            getWorld().removeObject( Ichigo4 );
        }  
    if( getRotation() == 0  && Cream != null ){
            fruits2++;
            getWorld().removeObject( Cream );
        }
    if( getRotation() == 90  && Cream2 != null ){
            fruits2++;
            getWorld().removeObject( Cream2 );
        }  
    if( getRotation() == 180  && Cream3 != null ){
            fruits2++;
            getWorld().removeObject( Cream3 );
        }  
    if( getRotation() == 270  && Cream4 != null ){
            fruits2++;
            getWorld().removeObject( Cream4 );
        }  
    if(fruits == 4){
            getWorld().showText( "CLEAR", 400 , 400 );
            Greenfoot.stop();
    }
    if(fruits2 == 4){
            getWorld().showText( "GAME OVER", 400 , 400 );
            Greenfoot.stop();
    }
    }    
    
    
}
