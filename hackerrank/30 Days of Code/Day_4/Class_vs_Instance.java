package Day_4;

import java.util.Scanner;

public class Class_vs_Instance {
    private int age;	
    
	public Class_vs_Instance(int initialAge) {
        if(initialAge < 0 ) {
            initialAge=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
	}
	
	public void amIOld() {
  		if (age<13) {
  			System.out.println("You are young.");
  		} else if (age>=13&&age<18) {
  			System.out.println("You are a teenager.");
  		} else
        System.out.println("You are old.");
	}

	public void yearPasses() {
  		age+=1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Class_vs_Instance p = new Class_vs_Instance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
