package Data_Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student1 implements Comparable<Student1>{
	private int id;
	private String fname;
	private double cgpa;
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public int compareTo(Student1 s) {
		if (this.getCgpa()==s.getCgpa()) {
			if (this.getFname().equals(s.getFname())) {
				if (this.getId()>s.getId()) {
					return -1;
				} else if (this.getId()<s.getId()) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return this.getFname().compareTo(s.getFname());
			}
		} else if (this.getCgpa()>s.getCgpa()) {
			return -1;
		} else {
			return 1;
		}
	}
}

class SortByAllParameters implements Comparator<Student1> {
	@Override
	public int compare(Student1 s1, Student1 s2) {
		if (s1.getCgpa()==s2.getCgpa()) {
			if (s1.getFname().equals(s2.getFname())) {
				if (s1.getId()>s2.getId()) {
					return -1;
				} else if (s1.getId()<s2.getId()) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return s1.getFname().compareTo(s2.getFname());
			}
		} else if (s1.getCgpa()>s2.getCgpa()) {
			return -1;
		} else {
			return 1;
		}
	}
}

public class Java11_Sort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student1> studentList = new ArrayList<Student1>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		Collections.sort(studentList); //realization sort due to implementing comparable<> by class Student 
		Collections.sort(studentList, new SortByAllParameters()); //realization sort due to implementing new class SortByAllParameters which implement Comparator<> 
		
		for(Student1 st: studentList){
			System.out.println(st.getFname());
		}
	}
}
