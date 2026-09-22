import greenfoot.*;

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{ 
    private int speed;
    /**
     * Constructor for objects of class Dragon
     */
    public Dragon(int speedParam)
    {
        speed = speedParam; //gør at fart bliver en variabel for hvert eneste drage
    }
    
    public void act() {
        Wizard w = (Wizard) getWorld().getObjects(Wizard.class).get(0);
        turnTowards(w.getX(), w.getY());
        move(speed);
        
        Wizard wColision = (Wizard) getOneIntersectingObject(Wizard.class);
        if (wColision !=null){
            GameManager.health--;

}
}
}