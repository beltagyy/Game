package harrypotter.model.magic;

public class RelocatingSpell extends Spell {
  private int range;
  public RelocatingSpell(String name,int cost,int defaultCooldown ,int rangr){
	  super(name, cost,defaultCooldown);
	  this.range=range;
	  
  }
  public int getRange(){
	  return range;
	  
  }
}
