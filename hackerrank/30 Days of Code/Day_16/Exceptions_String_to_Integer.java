package Day_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions_String_to_Integer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        bufferedReader.close();
        
        try {
        	Integer intParse = Integer.parseInt(S);
        	System.out.println(S);
        } catch (Exception e) {
        	System.out.println("Bad String");
		}
    }
}
