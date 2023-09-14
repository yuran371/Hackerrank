package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10_Binary_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
      
        int m = 0;
        int t = 0;
        String bi = Integer.toBinaryString(n);
        int b = 0;
        for (int i=0; i<bi.length(); i++) {
        	if (bi.charAt(i)=='1') {
        		b++;
        		if (b>=t) t=b;
        	} else {b=0;}

        }

        System.out.println(t);



        bufferedReader.close();
    }
}
