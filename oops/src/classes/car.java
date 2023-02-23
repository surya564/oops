package classes;

//abstract

abstract class car {

abstract void start();
	 
	void stop() {
		
		System.out.println("train is stopping");
	}
		
}

class Honda extends car{

	
	void start() {
		
		System.out.println("train is starting");
	}
	
	void speed() {
		
		System.out.println("150mbps");
	}

	
	public class carslauch {
		
		public static void main(String[] args) {
			
			Honda hn = new Honda();
	
			
			hn.start();
			
			hn.stop();
			
			hn.speed();
			
		}
	}
	
	
}


	
	

