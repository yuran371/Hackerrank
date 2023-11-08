package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			sc.nextLine();
			for (int i=0; i<n; i++) {
				String name = sc.nextLine();
				int number = sc.nextInt();
				map.put(name, number);
				sc.nextLine();
			}
			while(sc.hasNext()) {
				String s = sc.nextLine();
				if (map.containsKey(s)) {
					System.out.println(s+"="+map.get(s));
				} else System.out.println("Not found");
			}
		}
	}
}
