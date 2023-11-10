package day14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
      Difference (int[] a) {
          this.elements=a;
      }
      
      void computeDifference() {
    	  int dif = 0;
          for (int i=0; i<elements.length; i++) {
        	  for (int j=i+1; j<elements.length; j++) {
        	  int min = 0;
        	  int max = 0;
        	  if (Math.abs(elements[i])>Math.abs(elements[j])) {
                  max = Math.abs(elements[i]);
                  min = Math.abs(elements[j]);
              } else {
                  max = Math.abs(elements[j]);
                  min = Math.abs(elements[i]);
        	  }
        	  if ((max-min)>dif) {
        		  dif = (max-min);
        	  }
        	  }
          }
          maximumDifference = dif;
      }
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
