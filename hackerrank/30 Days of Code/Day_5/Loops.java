package Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
    	int n = Integer.parseInt(bf.readLine().trim());
    	
    	for (int i=1; i<=10; i++) {
    		System.out.println(n+" x "+i+" = "+(n*i));
    	}
    	
    	bf.close();
    }
}
