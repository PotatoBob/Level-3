import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class AnimalHipsters {
	static ArrayList<String> Amy = new ArrayList<>();
	static ArrayList<String> Brie = new ArrayList<>();	
	static ArrayList<String> Chris = new ArrayList<>();	
	static ArrayList<String> Devney = new ArrayList<>();	
	static ArrayList<String> Elena = new ArrayList<>();		
	static ArrayList<String> FanHal = new ArrayList<>();
	public static void main(String[] args) {
		AnimalHipsters AH = new AnimalHipsters();
	}
	AnimalHipsters() {
		Amy.add("Brie"); //Amy connected to Brie
		Amy.add("Chris"); //Amy connected to Chris
		Brie.add("Amy"); //Brie connected to Amy
		Brie.add("Chris"); //Brie connected to Chris
		Brie.add("Devney"); //Brie connected to Devney
		Brie.add("Elena"); //Brie connected to Elena
		Chris.add("Amy"); //Chris connected to Amy
		Chris.add("Brie"); //Chris connected to Brie
		Chris.add("Elena"); //Chris connected to Elena
		Chris.add("Fan-Hal"); //Chris connected to Fan-Hal
		Devney.add("Brie"); //Devney connected to Brie
		Devney.add("Elena"); //Devney connected to Elena
		Elena.add("Brie"); //Elena connected to Brie
		Elena.add("Chris"); //Elena connected to Chris
		Elena.add("Devney"); //Elena connected to Devney
		Elena.add("Fan-Hal"); //Elena connectd to Fa-Hal
		FanHal.add("Chris"); //Fan-Hal connected to Chris
		FanHal.add("Elena"); //Fan-Hal connected to Elena
	}
	static ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals) {
		network.put("Amy", Amy); //Amy connected to Amy ArrayList
		network.put("Brie", Brie); //Brie connected to Brie ArrayList
		network.put("Chris", Chris); //Chris connected to  Chris ArrayList
		network.put("Devney", Devney); //Devney connected to Devney ArrayList
		network.put("Elena", Elena); //Elena connected to Elena ArrayList
		network.put("Fan-Hal", FanHal); //Fan-Hal connected to FanHal ArrayList
		
		favoriteAnimals.put("Amy", "Quokka"); //Amy's favorite is Quokka
		favoriteAnimals.put("Brie", "Springbok"); //Brie's favorite is Springbok
		favoriteAnimals.put("Chris", "Nubian Ibex"); //Chris's favorite is Nubian Ibex
		favoriteAnimals.put("Devney", "Springbok"); //Devney's favorite is Springbok
		favoriteAnimals.put("Elena", "Quokka"); //Elena's favorite is Quokka
		favoriteAnimals.put("Fan-Hal", "Springbok"); //Fan-Hal's favorite is Springbok
		
		for (String string : Amy) {
			if (!favoriteAnimals.get(string).equals("Quokka")) {
				
			}
			else {
				network.remove("Amy");
				favoriteAnimals.remove("Amy");
				break;
			}
		}
		for (String string : Brie) {
			if (!favoriteAnimals.get(string).equals("Springbok")) {
				
			}
			else {
				network.remove("Brie");
				favoriteAnimals.remove("Brie");
				break;
			}
		}
		for (String string : Chris) {
			if (!favoriteAnimals.get(string).equals("Nubian Ibex")) {
				
			}
			else {
				network.remove("Chris");
				favoriteAnimals.remove("Chris");
				break;
			}
		}
		for (String string : Devney) {
			if (!favoriteAnimals.get(string).equals("Springbok")) {
				
			}
			else {
				network.remove("Devney");
				favoriteAnimals.remove("Devney");
				break;
			}
		}
		for (String string : Elena) {
			if (!favoriteAnimals.get(string).equals("Quokka")) {
				
			}
			else {
				network.remove("Elena");
				favoriteAnimals.remove("Elena");
				break;
			}
		}
		for (String string : FanHal) {
			if (!favoriteAnimals.get(string).equals("Springbok")) {
				
			}
			else {
				network.remove("Fan-Hal");
				favoriteAnimals.remove("Fan-Hal");
				break;
			}
		}
		return findAnimalHipsters(network, favoriteAnimals);
		
	}	
}
