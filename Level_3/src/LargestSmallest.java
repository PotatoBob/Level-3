import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LargestSmallest {
	Scanner keyboard = new Scanner(System.in);
	int sentinel = 0;
	String input = "";
	String[] thing;
	ArrayList<String> numbers = new ArrayList<String>();
	public static void main(String[] args) {
		LargestSmallest LS = new LargestSmallest();
	}
	LargestSmallest() {
		System.out.println("Enter numbers separated by spaces and the last one has to be 0");
		String x = keyboard.nextLine();
		System.out.println(x);
		x.split("0");
		System.out.println(x);
	}
	void findIt() {
		
	}
}
