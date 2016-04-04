
public class Minion {
	String a = "";
	int b = 0;
	String c = "";
	String d = "";
	public Minion(String name, int eyes, String color, String string) {
		// TODO Auto-generated constructor stub
		a = name;
		b = eyes;
		c = color;
		d = string;
	}

	public String getName() {
		
		
		return a;
	}

	public int getEyes() {
		
		return b;
	}

	public String getColor() {
		
		return c;
	}

	public void setMaster(String string) {
		
		d = string;
		
	}

	public String getMaster() {
		
		return d;
	}
	
	
}
