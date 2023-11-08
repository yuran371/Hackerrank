package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet bitSet1 = new BitSet(N);
        BitSet bitSet2 = new BitSet(N);
        BitSet[] bitSets = new BitSet[3];
        bitSets[1] = bitSet1;
        bitSets[2] = bitSet2;
        for (int i=0; i<M; i++) {
            String s = sc.next();
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            switch (s) {
            case "AND": bitSets[i1].and(bitSets[i2]); break;
            case "OR": bitSets[i1].or(bitSets[i2]); break;
            case "XOR": bitSets[i1].xor(bitSets[i2]); break;
            case "FLIP": bitSets[i1].flip(i2); break;
            case "SET": bitSets[i1].set(i2); break;
            }
        System.out.println(bitSet1.cardinality()+" "+bitSet2.cardinality());
        }
    }
}