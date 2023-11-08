package bigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInteger {
    public static void main(String[] args) throws IOException {
    	BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    	String n = BF.readLine();
    	String v = BF.readLine();
    	BigInteger a = new BigInteger(n);
    	BigInteger b = new BigInteger(v);
    	BigInteger multi = a.multiply(b);
    	BigInteger plus = a.add(b);
    	System.out.println(plus);
    	System.out.println(multi);
    }
}

