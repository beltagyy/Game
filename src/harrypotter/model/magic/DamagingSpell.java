package harrypotter.model.magic;

public class DamagingSpell extends Spell{
 private int damageAmount;
 public DamagingSpell (String name, int cost ,int defaultCooldown ,int damageAmount){
	 super(name ,cost,defaultCooldown);
	 this.damageAmount=damageAmount;
 }
  public int getDamageAmount(){
	  return damageAmount;
		  
	  
  }
}
