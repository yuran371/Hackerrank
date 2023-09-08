package Data_Structures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Java2_2D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });   
        bufferedReader.close();
        Integer[][] array = new Integer[arr.size()][];
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            array[i] = row.toArray(new Integer[row.size()]);
        }
        int a1=0;
		int a2=0;
		int a3=0;
		int sum=-11110;
        KVADRAT_OUTTER: for (int k=0; k<=3; k++) {
        	
        	KVADRAT_INNER: for (int l=0; l<=3; l++) {
        		a1=0;
        		
                PIRAM_OUTTER: for (int i=k; i<=2; i++) {
          		  a1=array[i][l]+array[i][l+1]+array[i][l+2]+
        				  +array[i+1][l+1]+
        				  +array[i+2][l]+array[i+2][l+1]+array[i+2][l+2];

 
                		
                	}
            	a3=a1+a2;
                if (sum<(a3)) {
                	sum=(a3);
                }
        	}
                
        	}
        System.out.println(sum);   	
    	}


    }
