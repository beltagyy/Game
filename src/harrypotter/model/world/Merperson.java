package harrypotter.model.world;

public class Merperson extends Obstacle {
	private int damage;
	public Merperson(int damage,int hp){
		super (hp);
		this.damage=damage;
	}
 public int getDamage(){
	 return damage;
 }
}
