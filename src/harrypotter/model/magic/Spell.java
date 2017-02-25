package harrypotter.model.magic;

public abstract class Spell {
 private String name;
 private int cost;
 private int defaultCooldown;
 private int coolDown;
 
 
 public Spell(String name, int cost, int defaultCooldown){
	
	 this.name=name;
	 this.cost=cost;
	 this.defaultCooldown=defaultCooldown;
	 }
 public String getName(){
	 return name;
	 
 }
 public int getCost(){
	 return cost;
 }
 public int getDefaultCooldown(){
	 return defaultCooldown;
	 
 }
 public int setCoolDown(){
	 return coolDown;
	 
 }
}
