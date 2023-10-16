package Data_Structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Java8_Arraylist {

	public static void main(String[] args) {
		List<List<Integer>> listOutter = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			List<Integer> listInner = new ArrayList<>();
			int d = sc.nextInt();
			for (int j=0; j<d; j++) {
				int dInner = sc.nextInt();
				listInner.add(dInner);
			}
			listOutter.add(listInner);
		}
//		System.out.println(listOutter);
		
		int q = sc.nextInt();
		for (int i=0; i<q; i++) {
			List<Integer> list = new ArrayList<>();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x<=listOutter.size()&&y<=listOutter.get(x-1).size()) {
				list.add(listOutter.get(x-1).get(y-1));
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					System.out.println(integer);
				}
			} else System.out.println("ERROR!");
		}
//		System.out.println(list);
	}
}
