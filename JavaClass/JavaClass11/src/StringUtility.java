
public class StringUtility {

	public static void main(String[] args) {
		
		String s = "Java";
		String s1 = "python";
		
		System.out.println("Length of the string: "+s.length());
		System.out.println("Upper case string: "+s.toUpperCase());
		System.out.println("Lower case string: "+s.toLowerCase());
		System.out.println("Index of v: "+s.indexOf("v"));
		System.out.println("isEquals: "+s.equals(s1));
		System.out.println("Contains: "+s1.contains("y"));
		System.out.println(s+" "+s1);
		System.out.println(s.concat(s1));
		
		//split
		String list = "CSE115,CSE215,CSE225,CSE231";
		System.out.println("\nlist: "+list);
		String[] courses = list.split(",");
		
		//for-each loop
		for(String i:courses) {
			System.out.println(i);
		}
		

	}

}
