package stringPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StringReverse {

	
    public static void main (String[] args) throws IOException {
    	BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    	String s = BF.readLine();
    	String k = BF.readLine();
    	String n = BF.readLine();
    	Pervij.cikl(s);
    	Vtoroj.SBrevers(k);
    	Tretij.Stackk(n);
    	
    			 			
}
}
 class Pervij {
	 public static void cikl(String s) {
	 String naoborot = "";
	for (int i=s.length()-1; i>=0; i--) {
		naoborot += s.charAt(i);
	}
		if (naoborot.equals(s)) {
			System.out.println("Yes");
		} else System.out.println("No");
}
}
 class Vtoroj {
	 public static void SBrevers (String k) {
		 String SB = new StringBuilder(k).reverse().toString();
		 if (SB.equals(k)) {
			 System.out.println("Yes");
		 } else System.out.println("No");
	 }
 }
 class Tretij {
	 public static void Stackk (String str) {
		 Stack <Character> stack = new Stack<Character>();
		 char[] ch = str.toCharArray();
		 for (int i=0; i<str.length(); i++) {
			 stack.push(ch[i]);
		 }
		 int k = 0;
		 while(!stack.isEmpty()) {
			 ch[k++]=stack.pop();
		 }
		 String ss = String.copyValueOf(ch);
		 if (ss.equals(str)) {
			 System.out.println("Yes");
		 } else {
		 System.out.println("No");
		 }
	 } 
 }