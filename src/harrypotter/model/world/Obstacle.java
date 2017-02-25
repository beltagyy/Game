package harrypotter.model.world;

public abstract class Obstacle {
	int hp;
	public Obstacle(int hp){
		this.hp=hp;
	}
	public int gethp(){
		return hp;
		
	}
}
