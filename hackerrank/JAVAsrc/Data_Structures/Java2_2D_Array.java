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
        Integer[][] array = new Integer[arr.size()][];
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            array[i] = row.toArray(new Integer[row.size()]);
        }
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
        KVADRAT_OUTTER: for (int k=0; k<4; k++) {
        	KVADRAT_INNER: for (int l=0; l<4; l++) {
                PIRAM_OUTTER: for (int i=0; i<3; i++) {
                	PIRAM_INNER: for (int j=0; j<3; j++) {
                		int a1=1;
                		int a2=1;
                		int a3=1;
                		if (i==1||i==3) {
                		  a1=array[i][j];
                		} else {
                   			 a2=array[i][j+1];	
                		} System.out.println(a3=a1+a2);
                	}
                	
                	
                }
        	}
    	}
        bufferedReader.close();
    }
}
