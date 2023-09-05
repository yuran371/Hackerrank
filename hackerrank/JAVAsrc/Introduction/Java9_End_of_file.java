package Introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java9_End_of_file {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i=1;        
            while (scn.hasNext()) {
            	System.out.printf("%d %s", i, scn.nextLine());
            	System.out.println();
            	i++;
            	if (scn.nextLine().isEmpty()) {
            		System.out.println("End-Of-File");
            		break;
            	}
            	
            }
            scn.close();
        }
    }

