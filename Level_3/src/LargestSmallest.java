import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class LargestSmallest {
	int sentinel = 0;
	String input = "";
	String[] thing;
	ArrayList<String> numbers = new ArrayList<String>();
	public static void main(String[] args) {
		LargestSmallest LS = new LargestSmallest();
	}
	LargestSmallest() {
		input = JOptionPane.showInputDialog("Input numbers separated by a comma (no spaces), and the last number should be a '0'");
		thing = input.split(",");
		numbers = (ArrayList<String>) (Arrays.asList(thing));
	}
	void findIt() {
		
	}
}
