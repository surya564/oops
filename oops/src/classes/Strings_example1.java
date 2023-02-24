package classes;

public class Strings_example1 {

	public static void main(String[] args) {
		
		String Name ="surya";
	
		String Name1="Ramakrishna";
		
		String Name2= 30+30+"surya"+30+30;
		
		System.out.println(Name.toLowerCase());
		System.out.println(Name.toUpperCase());
		System.out.println(Name.length());
		System.out.println(Name.endsWith("i"));
		System.out.println(Name.endsWith("a"));
		System.out.println(Name.startsWith("s"));
		
		System.out.println(Name.equals(Name1));
		
		System.out.println(Name.compareToIgnoreCase(Name1));
		
		System.out.println(Name.concat(Name1));
		
		System.out.println(Name.indexOf("y"));
	
		System.out.println(Name == Name1);
		
		System.out.println(Name2);
		
		}
}
