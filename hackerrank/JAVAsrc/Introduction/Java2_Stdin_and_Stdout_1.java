package Introduction;

import java.util.Scanner;

public class Java2_Stdin_and_Stdout_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);	
        		
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
