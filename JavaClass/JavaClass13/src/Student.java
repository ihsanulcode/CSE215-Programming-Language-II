import java.util.Arrays;

public class Student extends Person {
	private double CGPA;
	private String studentID;
	private String[] courses;

	Student() {

	}

	Student(String name, int age, String NID, double CGPA, String studentID, String[] courses) {
		super(name, age, NID);
		this.CGPA = CGPA;
		this.studentID = studentID;
		this.courses = courses;
	}

	public double getCGPA() {
		return CGPA;
	}

	public String getStudentID() {
		return studentID;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "; Age: " + this.getAge() + "; NID: " + this.getNID() + "; CGPA: "
				+ this.getCGPA() + "; Student ID: " + this.getStudentID() + "; Courses: " + Arrays.toString(courses);
	}
}
