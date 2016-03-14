
public class Recursion {
	static int x;
	public static void main(String[] args) {
		Recursion R = new Recursion();
	}
	Recursion() {
		System.out.println(x++);
		new Recursion();
	}
}
