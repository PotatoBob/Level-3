import java.util.ArrayList;

public class Classroom {
	
	float IQ = 0;

	ArrayList<Student> intelligence = new ArrayList<Student>();

	public static void main(String[] args) {
		Classroom C = new Classroom();
	}
	public Classroom() {
		Student A = new Student(1, "A");
		Student B = new Student(2, "B");
		Student C = new Student(3, "C");
		Student D = new Student(4, "D");
		Student E = new Student(5, "E");
		Student F = new Student(1289, "F");
		intelligence.add(A);
		intelligence.add(B);
		intelligence.add(C);
		intelligence.add(D);
		intelligence.add(E);
		intelligence.add(F);
		/*
		for (Student I : intelligence) {
			System.out.print(I.getName());
			System.out.println(I.getIntell());
		}*/
		averageIQ();
	}
	void averageIQ() {
		for (Student I: intelligence) {
			IQ = IQ + I.getIntell();
		}
		IQ = IQ/intelligence.size();
		System.out.println(IQ);
	}
}
