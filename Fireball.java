import greenfoot.*;

import java.util.List;

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private Dragon target;
    
    /**
     * Constructor for objects of class Fireball
     */
    public Fireball(Dragon dragonParam)
    {
        target = dragonParam;
    }
    
    public void act() {
        turnTowards(target.getX(), target.getY());
        move(4);
        
        List<Dragon> dragons = getIntersectingObjects(Dragon.class);
        
        for(int i=dragons.size()-1; i >= 0; i--) {
            if (dragons.get(i) instanceof DragonBoss) { //Skader kun Boss i stedet for oneshot
                DragonBoss boss = (DragonBoss)dragons.get(i);
                boss.takeDamage();
            }
                else { getWorld().removeObject(dragons.get(i)); // List / arrays indexes are zero based (0,1,2,3,4)
                GameManager.kills++;
                }

        }
        
        if (dragons.size() > 0) {
            getWorld().removeObject(this);
            GreenfootSound deathSound = new GreenfootSound("Death.wav");
            deathSound.play();
        }
        
    }
}
