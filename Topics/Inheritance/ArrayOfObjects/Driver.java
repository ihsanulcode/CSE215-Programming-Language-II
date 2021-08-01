
public class Driver {

	public static void main(String[] args) {

		// Faculty objects
		Faculty f1 = new Faculty("Dr.John", "Biden", "12345", 35, "1", "professor1",
				new String[] { "MAT116", "MAT120", "MAT130", "MAT250" });
		Faculty f2 = new Faculty("Dr. Mohammad", "Forhad", "12346", 45, "2", "professor2",
				new String[] { "CSE115", "CSE215", "CSE225", "CSE331" });
		Faculty f3 = new Faculty("Dr. Shafin", "Rahman", "12347", 55, "3", "professor3",
				new String[] { "ENG102", "ENG103", "ENG111" });

		// Student
		Student s1 = new Student("Alim", "Hasan", "121", "1", 25, 3.5f,
				new String[] { "MAT116", "MAT120", "MAT130", "MAT250" });
		Student s2 = new Student("Karim", "Hasan", "122", "2", 26, 3.0f,
				new String[] { "MAT116", "MAT120", "MAT130", "MAT250" });
		Student s3 = new Student("Reza", "Hasan", "123", "3", 27, 3.8f,
				new String[] { "MAT116", "MAT120", "MAT130", "MAT250" });

		// printing
		System.out.println("Faculty");
		System.out.println(f1.toString());
		System.out.println();
		System.out.println(f2.toString());
		System.out.println();
		System.out.println(f3.toString());

		System.out.println("\nStudent");
		System.out.println(s1.toString());
		System.out.println();
		System.out.println(s2.toString());
		System.out.println();
		System.out.println(s3.toString());

		// for largest cgpa
		System.out.println("\nMax:");
		if (s1.getCgpa() > s2.getCgpa() && s1.getCgpa() > s3.getCgpa()) {
			System.out.println("Name: " + s1.getFullName() + "\nCGPA: " + s1.getCgpa());
		} else if (s2.getCgpa() > s3.getCgpa()) {
			System.out.println("Name: " + s2.getFullName() + "\nCGPA: " + s2.getCgpa());
		} else {
			System.out.println("Name: " + s3.getFullName() + "\nCGPA: " + s3.getCgpa());
		}
	}

}
