package String;
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "\\b[a-zA-Z]\\w{7,}\\b";
    

}


public class Java9_Valid_Username_Regular_Expression {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}