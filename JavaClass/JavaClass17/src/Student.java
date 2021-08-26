
public class Student extends Person implements StudentID {

	@Override
	public int getStudentID() {
		return this.ID;
	}

}
