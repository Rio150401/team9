import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        addObject( new PC1(), 400, 400 );
        for (int i=0; i<1; ++i){
             int A = 350;
             int B = 450;
             int range = B - A;
             int x = A + (int)(Math.random()*(range));
             A = 0;
             B = 10;
             int y = A + (int)(Math.random()*(range));
            addObject( new ichigo(), x, y);
        }
          for (int i=0; i<1; ++i){
             int A = 350;
             int B = 450;
             int range = B - A;
             int x = A + (int)(Math.random()*(range));
             A = 700;
             B = 800;
             int y = A + (int)(Math.random()*(range));
            addObject( new ichigo(), x, y);
        }
        for (int i=0; i<1; ++i){
             int A = 0;
             int B = 100;
             int x = A + (int)(Math.random()*((B-A)+1));
             A = 350;
             B = 450;
             int y = A + (int)(Math.random()*((B-A)+1));
            addObject( new danmaku(), x, y);
        }

        addObject( new ichigo(), 400 , 0  );
        addObject( new danmaku(), 0, 400 );

    }
}
