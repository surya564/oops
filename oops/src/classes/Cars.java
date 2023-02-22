package classes;

public class Cars {

	void Start() {
		
		System.out.println("car is starting");
	}
	
	void stop() {
		
		System.out.println("car is stopping");
	}
	
	void drift() {
		
		System.out.println("car is drafting");
	}
	
}

 class Benz extends Cars{
	
	void drift() {
		
		System.out.println("Benz cant draft");
	}
	
	void logo() {
		
		System.out.println("more value for its logo");
	}
}

class Audi extends Cars{
	
	void drift() {
		
		System.out.println("drift swiftly");
	}
	
	void apperance() {
		
		System.out.println("more value for its apperance");
	}
	
	
	public class launchCar {
	
		public static void main(String[] args) {
			
	      
			Audi a1 = new Audi();
			
			a1.drift();
			
			a1.apperance();
			
			a1.Start();
			
			a1.stop();
			
			Benz b1 = new Benz();
			
			b1.drift();
			
			b1.logo();
			
			b1.Start();
			
			b1.stop();
			
			Cars c1 = new Cars();
			
			c1.drift();
			
			c1.Start();
			
			c1.stop();
            			
			
		}
	}
}

