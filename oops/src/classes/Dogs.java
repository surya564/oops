package classes;

public class Dogs {

//	public and private
	
	private String Name;
	
	private String Color;
	
	private int Cost;
	
	public Dogs() {
		
		Name ="kittu";
		
		Color ="white";
		
		Cost = 12000;
	}
	
	public Dogs(String Name) {
		
		this.Name =Name;
	}
	
	public Dogs(String Name,String Color) {
		
		this.Name =Name;
		
		this.Color =Color;
	}
	public Dogs(String Color, int Cost) {
		
		this.Color =Color;
		
		this.Cost =Cost;
	}	
	
	
	   public class LaunchDog{
		   
		   public static void main(String[] args) {
			
			   Dogs d1 = new Dogs();
			   
			   d1.Name ="king";
			   
			   d1.Color="brown";
			   
			   d1.Cost=12000;
			 
			   
			   System.out.println(d1.Name + d1.Color +d1.Cost);
	
			   
		}
		
	}

		
	}
	

