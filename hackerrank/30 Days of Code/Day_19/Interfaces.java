package Day_19;

import java.util.Scanner;

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

public class Interfaces implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	int sum=0;
    	for (int i=n; i>0; i--) {
    		if (n%i==0) {
    			sum+=i;
    		}
    	}
    	
        return sum;
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Interfaces(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}