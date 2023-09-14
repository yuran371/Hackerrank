package Day_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro_to_Conditional_Statements {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        if(1<=N&&N<=100) {
	        if (N%2==0&&2<=N) {
	        	System.out.println("Not Weird");

	 } else System.out.println("Weird");
	        bufferedReader.close();
	    }
}
}
