
package asteroids;

import java.util.Random;


public class Asteroid extends Character {
    
    private double rotationalMovement;
    private boolean alive;
    
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
        
        Random random = new Random();
        
        super.getCharacter().setRotate(random.nextInt(360));
        
        int accelerationAmount = 1 + random.nextInt(10);
        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }
        
        this.rotationalMovement = 0.5 - random.nextDouble();
        this.alive = true;
        
    }
    
    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    
    
}
