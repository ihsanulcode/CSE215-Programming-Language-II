
import java.util.Arrays;

public class Faculty extends Person {
	private String facultyId;
	private String[] courses;
	private String designation;

	Faculty() {

	}

	public Faculty(String firstName, String lastName, String nationalId, int age, String facultyId, String designation,
			String[] courses) {
		super(firstName, lastName, nationalId, age);
		this.facultyId = facultyId;
		this.designation = designation;
		this.courses = courses;

	}

	public String toString() {
		return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge()
				+ "\nFaculty ID: " + facultyId + "\nNation Id: " + getNationalID() + "\nDesignation: " + designation
				+ "\nCourses: " + Arrays.toString(courses);
	}

	public String[] getCourses() {
		return courses;
	}

	public String getDesignation() {
		return designation;
	}

	public void setCourses(String[] newCourses) {
		this.courses = newCourses;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
