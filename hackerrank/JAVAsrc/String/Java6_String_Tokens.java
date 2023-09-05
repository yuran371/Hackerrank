package String;

import java.util.Arrays;
import java.util.Scanner;

public class Java6_String_Tokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.isBlank()) {
			System.out.println(0);
		} else {
		String[] words = s.trim().split("[\\W]+");
	
		System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		scan.close();
	}
  }
}
