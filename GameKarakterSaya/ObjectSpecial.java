import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectSpecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectSpecial extends Actor
{
    public ObjectSpecial() {
        setImage("coin.png");
        GreenfootImage img = this.getImage();
        img.scale(30,30);
        this.setImage(img);
    }
    public void act()
    {
        checkForCollision();
        setLocation(getX(), getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
    
    public void checkForCollision() {
        Actor character = getOneIntersectingObject(character.class);
        if (character != null) {
            ((character) character).increaseScore();
            getWorld().removeObject(this);
        }
    }
}

