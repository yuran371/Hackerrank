package String;

import java.util.Arrays;
import java.util.Scanner;

public class Java5_Anagrams {
    static boolean isAnagram(String a, String b) {
    	String aa=a.toLowerCase();
        char [] aaa = aa.toCharArray();
        String bb=b.toLowerCase();
        char [] bbb = bb.toCharArray();
        Arrays.sort(aaa);
        Arrays.sort(bbb);
        if (Arrays.equals(aaa,bbb)) {
        	return true;
        } else {return false;}
         
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
