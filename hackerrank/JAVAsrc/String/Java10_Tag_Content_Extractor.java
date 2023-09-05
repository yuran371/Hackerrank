package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java10_Tag_Content_Extractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Pattern p = Pattern.compile("(<([^>]*)>)*([^<]*)(<\\/(\\2)>*)");
			Matcher m = p.matcher(in.nextLine());

				if (m.find()) {
				System.out.println(m.group(3));
			} else {
				System.out.println("None");
			}

			
			testCases--;
		}
	}
}
