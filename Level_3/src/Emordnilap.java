import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class Emordnilap {
	static ArrayList<String> stuff = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		URLReader();
		for (String string : stuff) {
			isPalindrome(string);
		}
		
	}
	public static boolean isPalindrome(String s) {
		char[] a = s.toCharArray();
		boolean x = true;
		for (int i = 0; i < a.length; i++) {
				if(a[i]!=a[a.length-i-1]) {
					x = false;
				}
				
			}
		if(x == false)
			System.out.println(s);
		return x;
	}
	
	static void URLReader() throws Exception {
		URL oracle = new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt");
		BufferedReader in = new BufferedReader (new InputStreamReader (oracle.openStream()));
		
		String inputLine;
		while ((inputLine = in.readLine()) !=null) {
			stuff.add(inputLine);
		}
		in.close();
	}
}