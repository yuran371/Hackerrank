package Day_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        Integer[] arrayInt = a.toArray(new Integer[a.size()]);
        int count = 0;
        int temp = 0;
        for (int i=0; i<arrayInt.length; i++) {
        for (int j=0; j<arrayInt.length-1; j++) {
        	if (arrayInt[j]>arrayInt[j+1]) {
        		temp=arrayInt[j];
        		arrayInt[j]=arrayInt[j+1];
        		arrayInt[j+1]=temp;
        		count++;
        	}
        }
     }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+arrayInt[0]);
        System.out.println("Last  Element: "+(arrayInt.length));
        
        
        bufferedReader.close();
    }
}