package dataStructures;

import java.util.Scanner;

public class N1DArray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         int[] a= new int[n];
         for (int i=0; i<a.length; i++) {
        	 int m=scan.nextInt();
        	 a[i]=m;
         }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
