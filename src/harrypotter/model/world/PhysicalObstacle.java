package harrypotter.model.world;

public class PhysicalObstacle extends Obstacle {
int damage;
public PhysicalObstacle(int damage, int hp){
	super(hp);
    this.hp=hp;
    
	
}
public int getHp(){
	return hp-1;
}
	
}
