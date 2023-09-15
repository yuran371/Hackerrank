package Day_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Lets_Review {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine().trim());

		for (int i=0; i<n; i++) {
			String inputString = bf.readLine();
			for (int j=0; j<inputString.length(); j++) {
				if (j%2==0||j==0) {
					System.out.print(inputString.charAt(j));
				} 
			}
				System.out.print(" ");
				for (int j=0; j<inputString.length(); j++) {
					if (j%2==1) {
						System.out.print(inputString.charAt(j));
					} 
			}
				System.out.println();
		}
	}
}
