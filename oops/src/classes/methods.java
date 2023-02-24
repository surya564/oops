package classes;

 interface methods {

	void speed();
	
}

class Hero_Honda implements methods{
	
	public void speed() {
		
		System.out.println("100kmph speed");
	}
}

class Kawasaki implements methods{
	
	public void speed() {
		
		System.out.println("260kmph speed");
	}
	
	public class lauchBike{
		
		public static void main(String[] args) {
			
			methods m = new Hero_Honda();
			methods m1 = new Kawasaki();
			m.speed();
			m1.speed();
			
			
		}		
	}
}

