package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {



    public static int factorial(int n) {
//    	if (n<0) {
//    		return (Integer) null;
//    	}
//    	if (n==0) {
//    		return 1;
//    	}
//    	if (n==1) {
//    		return n;
//    }
//    	return n*factorial(n-1);
    	return (n == 1) ? 1 : n*factorial(n-1) ; // альтернативное решение в одну строчку

    }
    
}

public class Recursion3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        System.out.println(result);
    }
}
