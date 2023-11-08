package dataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparator<Student>{
	private int id;
	private String name;
	private double cgpa;
	public Student (String name, double cgpa, int id) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double  cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getCgpa()>o2.getCgpa()) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName())==1) {
			
			} else if (o1.getId()>o2.getId()) {
				return 1;
			} else return -1;
		return 0;
		}
}

class Priorities {
	List<Student> getStudents(List<String> events) {
		PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new Student(null, 0, 0));
		List<Student> finishList = new ArrayList<Student>();

		for (int i=0; i<events.size(); i++) {
			String[] eventsArray = events.get(i).split("\\s+");

			
			if (eventsArray[0].equals("ENTER")) {
				double a = Double.parseDouble(eventsArray[2]);
				int b = Integer.parseInt(eventsArray[3]);
				studentPriorityQueue.add(new Student(eventsArray[1], a, b));
			} else {
				studentPriorityQueue.poll();
			}
		}
		
		for (int i=0; i<studentPriorityQueue.size(); i++) {
			finishList.add(studentPriorityQueue.poll());
		}
		

		return finishList;
		
	}
}


	


public class PriorityQueueTask {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
