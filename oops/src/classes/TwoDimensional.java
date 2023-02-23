package classes;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		
	
			Scanner scr = new Scanner(System.in);
			
			System.out.println("enter the first square");
			
			int m =scr.nextInt();
			
			System.out.println("enter the second square");
			
			int n = scr.nextInt();
			
			int a[][] = new int[m][n];
			
			for(int i=0; i<m; i++) {
				
				for(int j=0; j<n; j++) {
					
					a[i][j]=scr.nextInt();
				}
			}
			
			for(int i=0; i<m; i++) {
				
				for(int j=0; j<n; j++) {
							
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			
		
	}
}
