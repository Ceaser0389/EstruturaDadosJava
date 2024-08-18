package aula001;

import java.util.Scanner;

public class Main002 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);

		String[] n = new String[2];
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("Entre com o nome");
			 n[i]= sc.nextLine();
		}
		
		System.out.println("*****");
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
