import java.util.Arrays;

public class Faculty extends Person {
	private String facultyID;
	private String designation;
	private String[] courses;

	Faculty() {

	}

	Faculty(String name, int age, String NID, String facultyID, String designation, String[] courses) {
		super(name, age, NID);
		this.facultyID = facultyID;
		this.designation = designation;
		this.courses = courses;
	}

	public String getFacultyID() {
		return facultyID;
	}

	public String getDesignation() {
		return designation;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Name:" + this.getName() + "; Age: " + this.getAge() + "; Faculty ID: " + this.getFacultyID() + "; NID: "
				+ this.getNID() + "; Designation: " + this.getDesignation() + "; Courses: " + Arrays.toString(courses);
	}
}
