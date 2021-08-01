
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	protected String nationalID;

	Person() {

	}

	public Person(String firstName,String lastName,String nationalID,int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalID = nationalID;
		this.age = age;
	}
	
	public String toString() {
		return null;
	}
	
	public String getFullName() {
		return ""+firstName+" "+lastName;
	}
	
	public String getNationalID() {
		return nationalID;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	
	

}
