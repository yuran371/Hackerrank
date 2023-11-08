package bigNumber;

import java.util.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalTask {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        


        
        boolean sorted = false;
        BigDecimalTask [] arrBD = new BigDecimalTask[n];
        for (int i=0; i<arrBD.length; i++) {
        	arrBD[i]=new BigDecimalTask(s[i]);
        }
        
        while (!sorted) {
        	sorted = true;
            for (int i=0; i<n-1; i++) {
	            if (arrBD[i].compareTo(arrBD[i+1])==-1) {
	            	BigDecimalTask BD3=arrBD[i];
	            	arrBD[i]=arrBD[i+1];
	            	arrBD[i+1]=BD3;
 
	            	String s3 = s[i];
	            	s[i]=s[i+1];
	            	s[i+1]=s3;
	            	
	            	sorted = false;
            }
         }
      }     
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
