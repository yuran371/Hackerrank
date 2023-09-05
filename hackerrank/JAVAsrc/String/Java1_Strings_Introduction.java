package String;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java1_Strings_Introduction {
    public static void main(String[] args) throws IOException {
        BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
        String A = BF.readLine().trim();
        String B = BF.readLine().trim();
        int a = A.length();
        int b =  B.length();

        System.out.println(a+b);/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if (A.compareTo(B)>0) {
        	System.out.println("Yes");
        } else {
			System.out.println("No");
		}
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.println(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
