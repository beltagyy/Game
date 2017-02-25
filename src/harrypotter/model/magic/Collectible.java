package harrypotter.model.magic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Collectible {
	 private String name;
	  public Collectible(String name){
		  this.name=name;
		  
	  }
	  public String getName(){
	  return name;
	  }
}
