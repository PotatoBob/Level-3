import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {
	public static void main(String[] args) {
		ArrayListPuzzles ALP = new ArrayListPuzzles();
	}
	ArrayListPuzzles() {
	DinnerDecider();
	CommedyCentral();
	}
	void DinnerDecider() {
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("pie");
		foods.add("blueberry pie");
		foods.add("cherry pie");
		foods.add("apple pie");
		foods.add("pumpkin pie");
		foods.add("pie pie");
		System.out.println(foods.get(new Random().nextInt(6)));
	}
	void CommedyCentral() {
		ArrayList<String> jokes = new ArrayList<String>();
		jokes.add("What do you call a cow with 3 legs?");
		jokes.add("What do you call a cow with no legs?");
		jokes.add("What do you call a cow with 2 legs?");
		ArrayList<String> punchlines = new ArrayList<String>();
		punchlines.add("Lean beef");
		punchlines.add("Ground beef");
		punchlines.add("Yo' mama");
	}
}
