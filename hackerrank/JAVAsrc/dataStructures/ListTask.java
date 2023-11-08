package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListTask {

    public static void main(String[] args) throws IOException {
        List<Integer> L = new ArrayList<Integer>(); 
        
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        String []a= bf.readLine().split(" ");
        int [] v = new int[a.length];
        for (int i=0; i<a.length; i++) {
        	v[i] = Integer.parseInt(a[i]);
        }
        

        for (int i=0; i<c; i++) {
        	int g=v[i];
        	L.add(i, g);
        }
        int Q = Integer.parseInt(bf.readLine());
        
        for (int i=0; i<Q; i++) {
        	String b = bf.readLine();
        
        	if (b.equals("Insert")) {
        		 String[] a1= bf.readLine().split(" ");
        		// for (int j=0; j<2; j++) {
        	        int[] v1 = new int[a1.length];
        	        for (int i1=0; i1<a1.length; i1++) {
        	        	v1[i1] = Integer.parseInt(a1[i1]);
        	        }
            		L.add(v1[i], v1[i+1]);
        	} if (b.equals("Delete")) {
        		int del = Integer.parseInt(bf.readLine());
        		L.remove(del);
        	}
        }
        for (int i=0; i<L.size(); i++) {
        System.out.print(L.get(i)+" ");
        }
    }
}