package Data_Structures;
import java.util.Scanner;
public class Java3_Sybarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i]=sc.nextInt();
		}
		int s = 0;
		for (int i=0; i<A.length-1; i++) {
			s=A[i]+A[i+1];
			if(s<0) {
				s+=s;
			} else {
				continue;
			}

		}
	    System.out.println(s);
	}
}
