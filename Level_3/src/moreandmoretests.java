
public class moreandmoretests {
	public static void main(String[] args) {
		moreandmoretests MAMT = new moreandmoretests();
	}
	moreandmoretests() {
		
	}
	static String multiply(int x, int y) {
		System.out.println(x*y);
		String B = x + " x " + y +" = " +x*y;
		System.out.println(B);
		return B;
	}
	static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x%i == 0) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}
	static boolean isSquare(double x) {
		int xx = (int) Math.sqrt(x);
		if (xx*xx == x) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
	static boolean isCube(double x) {
		int xx = 0;
		while (xx*xx*xx != x && xx<x) {
			if (xx*xx*xx != x) {
				xx++;
			}
		}
		if (xx*xx*xx == x) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
}
