package harrypotter.model.magic;

import java.io.BufferedReader;import
java.io.FileReader;import 
java.io.IOException;


public class Potion extends Collectible {
 private int amount;
 public Potion(String name, int amount){
	 super(name);
	 this.amount=amount;
	 
 }
 public int getAmount(){
	 return amount;
 }
 
}
