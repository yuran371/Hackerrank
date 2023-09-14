 package Day_0;

import java.util.Scanner;

public class Hello_World {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String inputString = scan.nextLine(); 
		scan.close(); 

		System.out.println("Hello, World.");
        System.out.println(inputString);
	}
}
