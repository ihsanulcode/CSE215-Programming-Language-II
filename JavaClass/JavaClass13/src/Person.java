
public class Person {
	// data field
	private String name;
	private int age;
	private String NID;

	Person() {
		// no argument constructor
	}

	Person(String name, int age, String NID) { // argument constructor
		this.name = name;
		this.age = age;
		this.NID = NID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNID() {
		return NID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNID(String nID) {
		NID = nID;
	}

}
