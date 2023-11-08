package stringPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i=0; i<=s.length()-k; i++) {
        	String S = s.substring(i, k+i);
        	if (S.compareTo(smallest)>0) {
        		largest = S;        		
        	} else {
        		smallest = S;
        	}
        }
                
        return smallest + "\n" + largest;
    }


    public static void main (String[] args) throws IOException {
    	BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    	String s = BF.readLine();
    	int k = Integer.parseInt(BF.readLine());

      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
