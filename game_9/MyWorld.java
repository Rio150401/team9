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
        
        int ep=0;
        
        addObject( new PC1(), 400, 400 );
        while(ep==0){
            int a = 1;
            int b = 4;
            int crd = a + (int)(Math.random()*((b-a)+1));//出現座標の乱数
            
            int A = 1;
            int B = 100;
            int prb = A + (int)(Math.random()*((B-A)+1));//出現確率の乱数
            
            if(prb<=15){
                switch(crd){
                    case 1:
                        addObject( new cream(), 5, 400);//左から出現
                        //動かすコード
                    break;
                
                    case 2:
                        addObject( new cream(), 400, 5);//上から出現
                        //動かすコード
                    break;
                
                    case 3:
                        addObject( new cream(), 775, 375);//右から出現
                        //動かすコード
                    break;
                
                    case 4:
                        addObject( new cream(), 400, 775);//下から出現
                        //動かすコード
                    break;
                }
            }
            
            else{
                switch(crd){
                    case 1:
                        addObject( new ichigo(), 5, 400);//左から出現
                        //動かすコード
                    break;
                
                    case 2:
                        addObject( new ichigo(), 400, 5);//上から出現
                        //動かすコード
                    break;
                
                    case 3:
                        addObject( new ichigo(), 775, 375);//右から出現
                        //動かすコード
                    break;
                
                    case 4:
                        addObject( new ichigo(), 400, 775);//下から出現
                        //動かすコード
                    break;
                }                
            }                
        }
    }
}
