import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {
	public static void main(String[] args) {
		ArrayListPuzzles ALP = new ArrayListPuzzles();
	}
	ArrayListPuzzles() {
	DinnerDecider();
	CommedyCentral();
	BandNameGenerator();
	Overload();
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
		int z = 0;
		ArrayList<String> jokes = new ArrayList<>();
		jokes.add("What do you call a cow with 3 legs?");
		jokes.add("What do you call a cow with no legs?");
		jokes.add("What do you call a cow with 2 legs?");
		ArrayList<String> punchlines = new ArrayList<>();
		punchlines.add("Lean beef");
		punchlines.add("Ground beef");
		punchlines.add("Yo' mama");
		System.out.println(jokes.get(z = new Random().nextInt(3)));
		System.out.println(punchlines.get(z));
	}
	void BandNameGenerator() {
		ArrayList<String> adj = new ArrayList<>();
		adj.add("minimum");
		adj.add("glorious");
		adj.add("vast");
		adj.add("universal");
		ArrayList<String> noun = new ArrayList<>();
		noun.add("ban");
		noun.add("abolition");
		noun.add("reader");
		noun.add("collaboration");
		System.out.print(adj.get(new Random().nextInt(4)) + " ");
		System.out.print(noun.get(new Random().nextInt(4)));
	}
	void Overload() {
		int x = 2147483647;
		ArrayList<Integer> bacon = new ArrayList<>();
		while(x==x) {
			bacon.add(x);
			x++;
			System.out.println(x);
		}
	}
}
