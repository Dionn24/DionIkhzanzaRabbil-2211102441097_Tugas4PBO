import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character extends Actor
{
    private int score = 0;
    
    public character() {
        setImage("yy.png");
        GreenfootImage img = this.getImage();
        img.scale(40,40);
        this.setImage(img);
    }

    public void act()
    {
        if (isTouching(enemy.class)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new gameover());
        }
        if (isTouching(Counter.class)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        checkForCollision();
    }
    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
        
    }
    public void increaseScore() {
        score += 10;
        getWorld().showText("Score: " + score, 50, 25);
        }  
}
