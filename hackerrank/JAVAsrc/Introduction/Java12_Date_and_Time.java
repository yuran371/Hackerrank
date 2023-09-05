package Introduction;
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

class Result {

    public static String findDay (int month, int day, int year) {
    
    	Calendar rightNow = Calendar.getInstance();

    	rightNow.set(year, month-1, day);
    	
    	int d =rightNow.get(Calendar.DAY_OF_WEEK);
    	String resultString = switch (d) {
    	case 1 ->  "SUNDAY";
    	case 2 -> "MONDAY";
    	case 3 -> "TUESDAY";
    	case 4 ->  "WEDNSDAY";
    	case 5 -> "THURSDAY";
    	case 6 -> "FRIDAY";
    	case 7 -> "SATURDAY";
    	default -> "ERROR";
    	};    	
    
    return resultString.toString();
    }
}
   

public class Java12_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        bufferedReader.close();
        System.out.println(res);

    }
}
