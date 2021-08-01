
import java.util.Arrays;

public class Student extends Person {
	private float cgpa;
	private String studentId;
	private String[] courses;

	Student() {

	}

	public Student(String firstName, String lastName, String nationalId, String studentId, int age, float cgpa,
			String[] courses) {
		super(firstName, lastName, nationalId, age);
		this.cgpa = cgpa;
		this.studentId = studentId;
		this.courses = courses;
	}

	public String toString() {
		return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge()
				+ "\nStudent ID: " + studentId + "\nNation Id: " + getNationalID() + "\nCGPA: " + cgpa + "\nCourses: "
				+ Arrays.toString(courses);
	}

	public float getCgpa() {
		return cgpa;
	}

	public String getStudentId() {
		return studentId;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCgpa(float newCgpa) {
		this.cgpa = newCgpa;
	}

	public void setCourses(String[] newCourses) {
		this.courses = newCourses;
	}

}
