package Day_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dictionaries_and_Maps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mapWithNumbers = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mapWithNumbers.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (mapWithNumbers.get(s)==null) {
            	System.out.println("Not found");
            } else System.out.println(s+"="+mapWithNumbers.get(s));
            
//            for (Entry<String, Integer> ss:mapWithNumbers.entrySet()) { // Mojno cherez LinkeHashMap,
//            	if (mapWithNumbers.containsKey(s)) {					 // no ne prohodit case v Hackerranke
//					System.out.println(ss.getKey()+"="+ss.getValue());
//				} else System.out.println("Not found");
//            }
        }
        in.close();
    }
}
