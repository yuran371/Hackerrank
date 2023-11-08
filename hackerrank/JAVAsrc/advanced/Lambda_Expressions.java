package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

interface PerformOperation {
	 boolean check(int a);
	}

	class MyMath {
	 public static boolean checker(PerformOperation p, int num) {
	  return p.check(num);
	}
	    public PerformOperation isOdd() { 
	        return a -> a%2!=0;
	    }
	    public PerformOperation isPrime() {
	    	return a -> {
	    		int i =2;
	    		boolean flag = false;
	    		while (i <= a/2) {
	    			if (a % i == 0) {
	    		        flag = true;
	    		        break;
	    		      }
	    			++i;
	    		}
	    		if (!flag) {
	    			return true;
	    		} else {
	    			return false;
	    		}
	    	};
	    }
	    public PerformOperation isPrime2() { 		// solution through Stream API and BigInteger.isProbablePrime()
	    	return a -> {
	    		 boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(a))
	    	                .noneMatch(i -> BigInteger.valueOf(a).isProbablePrime(1));

	    	        if (isPrime) {
	    	            return true;
	    	        } else {
	    	        	return false;
	    	        }
	    	};
	    }
	    public PerformOperation isPalindrome() {
	    	return a -> {
	    		int temp;
	    		int r;
	    		int sum=0;
	    		temp=a;
	    		while (a>0) {
	    			r = a%10;
	    			sum = (sum*10)+r;
	    			a=a/10;
	    		}
	    		if (temp==sum) {
	    			return true;
	    		} else {
	    			return false;
	    		}
	    	};
	    }
}
	
public class Lambda_Expressions {
	public static void main(String[] args) throws IOException {
		  MyMath ob = new MyMath();
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int T = Integer.parseInt(br.readLine());
		  PerformOperation op;
		  boolean ret = false;
		  String ans = null;
		  while (T--> 0) {
		   String s = br.readLine().trim();
		   StringTokenizer st = new StringTokenizer(s);
		   int ch = Integer.parseInt(st.nextToken());
		   int num = Integer.parseInt(st.nextToken());
		   if (ch == 1) {
		    op = ob.isOdd();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "ODD" : "EVEN";
		   } else if (ch == 2) {
		    op = ob.isPrime();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PRIME" : "COMPOSITE";
		   } else if (ch == 3) {
		    op = ob.isPalindrome();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

		   }
		   System.out.println(ans);
		  }
		 }
}
