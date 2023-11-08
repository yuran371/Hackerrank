package bigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerTask {
    public static void main(String[] args) throws IOException {
    	BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    	String n = BF.readLine();
    	String v = BF.readLine();
    	BigIntegerTask a = new BigIntegerTask(n);
    	BigIntegerTask b = new BigIntegerTask(v);
    	BigIntegerTask multi = a.multiply(b);
    	BigIntegerTask plus = a.add(b);
    	System.out.println(plus);
    	System.out.println(multi);
    }
}

