package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name,email);	
			System.out.println();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("Busy Rooms:");
		
		for(int i=1; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		

		sc.close();
	}

}
