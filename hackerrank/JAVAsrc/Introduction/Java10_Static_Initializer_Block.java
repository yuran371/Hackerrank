package Introduction;
import java.io.*;
import java.util.*;

public class Java10_Static_Initializer_Block {
	  static {
		  BufferedReader BF = new BufferedReader (new InputStreamReader (System.in));
		  int B = 0;
		  int H = 0;
		  try {
			  B=Integer.parseInt(BF.readLine().trim());
			  H=Integer.parseInt(BF.readLine().trim());
		  } catch (IOException e) {
			  System.out.println(e.getMessage());			  
		  } finally {
			try {
				BF.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		 
		  if (B<=0||H<=0) { 
			  try {
			  throw new Exception ("java.lang.Exception: ");
			  } catch (Exception e) {
			  System.out.println(e.getMessage() + "Breadth and height must be positive");
		  }
		  } else
		  System.out.println(B*H);
	  }
	    public static void main(String[] args) {
	}
}
