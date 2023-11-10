package day12;

import java.util.Scanner;


public class Inheritance {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Inheritance(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
	
}
class Student extends Inheritance{
	Student(String firstName, String lastName, int identification, int []testScores) {
		super(firstName, lastName, identification);
		this.testScores=testScores;
		this.firstName=firstName;
		this.idNumber=identification;
		this.lastName=lastName;	
	}
	char calculate () {
		int sum=0;
		for (int i=0; i<testScores.length; i++) {
			sum+=testScores[i];
		}
		sum/=testScores.length;
		if (90<=sum&&sum<=100) {
			return 'O';
		} else	if (80<=sum&&sum<=90) {
			return 'E';
		} else	if (70<=sum&&sum<=80) {
			return 'A';
		} else	if (55<=sum&&sum<=70) {
			return 'P';
		} else	if (40<=sum&&sum<=55) {
			return 'D';
		} else	if (40>sum) {
			return 'T';
		} else	return Character.MIN_VALUE;		
	}
	private int[] testScores;
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}


