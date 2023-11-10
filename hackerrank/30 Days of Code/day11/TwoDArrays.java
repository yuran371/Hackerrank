package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class TwoDArrays {
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
        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = array[i][j] + array[i][j+1] + array[i][j+2]
                        + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1]
                        + array[i+2][j+2];
                h++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}
