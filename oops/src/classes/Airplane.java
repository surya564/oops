package classes;

public class Airplane {

	public int res1;
	
	public int res2;
	
	public int res3;

	
}

class Indigo extends Airplane{
	
	
	void fly() {
		
		System.out.println("indigo flight can fly");
	}
	
	
	public class launch{
		
		public static void main(String[] args) {
			
			Airplane a1 = new Airplane();
			
			a1.res1=1;
			a1.res2=2;
			a1.res3 =3;
			
			System.out.println(a1.res1 + a1.res2 + a1.res3 );
			
		}
	}
}

