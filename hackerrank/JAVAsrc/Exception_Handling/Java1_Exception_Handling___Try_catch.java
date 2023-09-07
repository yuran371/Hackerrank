package Exception_Handling;

import java.util.Scanner;

public class Java1_Exception_Handling___Try_catch {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);

    	try {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
    		System.out.println(a/b);
    	} catch (Exception e) {
    		System.out.println(e);
    	}
        
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
