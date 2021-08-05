
public class Main {

	public static void main(String[] args) {

		// Student
		Student s1 = new Student("Jon Doe", 21, "165165465", 3.85, "201",
				new String[] { "CSE115", "CSE215", "CSE225" });
		Student s2 = new Student("Jon Devid", 22, "175165465", 3.75, "193",
				new String[] { "CSE115", "CSE215", "CSE225", "CSE231" });
		Student s3 = new Student("Jon Snow", 23, "185165465", 3.65, "192",
				new String[] { "CSE115", "CSE215", "CSE225", "CSE231", "CSE321" });

		// Faculty
		Faculty f1 = new Faculty("Dr. Forhad Uddin", 45, "465454", "65655", "Professor",
				new String[] { "CSE115", "CSE215", "CSE225", "CSE231", "CSE321" });
		Faculty f2 = new Faculty("Dr. Shahensha Khan", 55, "4545454", "45655", "Professor",
				new String[] { "CSE115", "CSE215", "CSE225", "CSE231" });
		Faculty f3 = new Faculty("Dr. Rezaul Bari", 35, "4454454", "454655", "Professor",
				new String[] { "CSE115", "CSE215", "CSE225" });
		
		Student[] students = new Student[3];
		Faculty[] faculty = new Faculty[3];
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		faculty[0] = f1;
		faculty[1] = f2;
		faculty[2] = f3;
		
		for (int i = 0; i < faculty.length; i++) {
			System.out.println(faculty[i].toString());
		}
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}

	}

}
