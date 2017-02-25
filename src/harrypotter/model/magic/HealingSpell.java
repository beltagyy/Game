package harrypotter.model.magic;

public class HealingSpell extends Spell{
	private int healingAmount;

public HealingSpell(String name , int cost, int defaultCooldown ,int healingAmount){
	super(name,cost,defaultCooldown);
	this.healingAmount=healingAmount;
	
}
public int getHealingAmount(){
	return healingAmount;
}

}
