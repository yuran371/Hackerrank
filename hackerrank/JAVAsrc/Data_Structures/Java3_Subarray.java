package Data_Structures;
import java.util.Scanner;
public class Java3_Subarray {
	public static void main(String[] args) {
//		Summa sm = new Summa();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i]=sc.nextInt();
		}
		int s = 0;
		int sum=0;
		for (int i=0; i<A.length; i++) {
			for (int j=i; j<A.length; j++) {
				s=0;
				for (int k=i; k<=j; k++) {
					s+=A[k];


				}
				if (s<0) {
					sum++;
				}
			}


		}
	    System.out.println(sum);
	}
}
//class Summa {
//    int Sum(int [] arrSum) {
//    	int i=0;
//    	int isum=arrSum[i]+arrSum[i+1];
//		return isum;
//    }
//}