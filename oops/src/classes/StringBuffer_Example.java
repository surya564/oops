package classes;

public class StringBuffer_Example {

	public static void main(String[] args) {
		
		//append
		
		StringBuffer sb = new StringBuffer("surya");
		
		
		
		sb.append("kondisetti");
		
		System.out.println(sb);
		
		
		//insert
		
	    sb.insert(3, "kondisetti");
		
		System.out.println(sb);

		//replace
		
		sb.replace(1, 3, "kondisetti");
		
		System.out.println(sb);
		
		//delete
		
		sb.delete(1, 3);
		
		System.out.println(sb);
		
		//reverse
		
		sb.reverse();
		
		System.out.println(sb);
		
	}
}
