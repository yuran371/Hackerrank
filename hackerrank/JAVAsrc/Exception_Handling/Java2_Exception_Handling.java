package Exception_Handling;

import java.util.Scanner;
class MyCalculator {
	long power (int n, int p) throws Exception {
	//	int np = (int) Math.pow(n,p);
		int res = 1;
		for (int i=1; i<=p; i++) {
			res=res*n;
		}
		if (n<0||p<0) {
			throw new Exception("n or p should not be negative");
		} else if (n==0&&p==0) {
			throw new Exception("n and p should not be zero");
		} else
		return res;
		
	}
}

public class Java2_Exception_Handling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
