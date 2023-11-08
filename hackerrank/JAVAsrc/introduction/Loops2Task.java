package introduction;
import java.util.*;
import java.io.*;
public class Loops2Task {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=0;
            for (int j=0;j<n; j++) {
                double p = Math.pow(2, j)*b;
                
                if(j==0) {
                    res = a+(int)p;
                } else {
                    res+=(int)p;
                }
                
                System.out.print(res+" ");
            }
                System.out.println();               
        }
        in.close();
    }
}