package Introduction;
import java.io.*;
import java.util.*;

public class Java10_Static_Initializer_Block {
    static Scanner scn = new Scanner(System.in);
    static int B = scn.nextInt();
    static int H = scn.nextInt();
    static int square;


  static {
      square = B*H;
      }
  
    public static int getSquare () {
        return square;
    }


    public static void main(String[] args) {
        if (B>0&&H>0) {
            System.out.println(getSquare());
        } else {
        	System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
