class Student {
	int rollNo;
	String name;

	void display() {
		System.out.println("Roll Number: " + rollNo + " Name: " + name);
	}
}

public class Day0_ClassAndObject {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNo = 01;
		s1.name = "Harvey";

		Student s2 = new Student();
		s2.rollNo = 02;
		s2.name = "Mike";

		s1.display();
		s2.display();
	}
}
