import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonBoss extends Dragon
{
    /**
     * Act - do whatever the DragonBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int bossHealth;
    public DragonBoss() {
    super(3); //boss fart da dragon constructor kræver en variabel
    bossHealth = 20;
}

    public void takeDamage() {
        bossHealth = bossHealth -1; // "adgangsdør" der giver fireball lov til at skade boss
        if (bossHealth <= 0) {
        getWorld().showText("YOU WON",400,300);
        getWorld().removeObject(this);
        Greenfoot.stop();
        }
    }
    }

