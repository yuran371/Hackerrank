package Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java11_Int_to _String {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
        	int n=Integer.parseInt(reader.readLine().trim());
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
        if (-100<=n&&n<=100) {
        	Integer.toString() 
        	
        }
        		
    }
}
