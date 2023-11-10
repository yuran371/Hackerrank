package day_15;

import java.util.Scanner;

// Лучшее объяснение работы LinkedList, а в частности вложенного класса Node https://www.freecodecamp.org/news/how-linked-lists-work/
public class LinkedListTask {
	int data;
	LinkedListTask next;
	
	LinkedListTask(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  LinkedListTask insert(LinkedListTask head,int data) {
    	LinkedListTask node = new LinkedListTask(data);
    	if(head == null) {
            head = node;
        } else {
           LinkedListTask nodeNext = head;	//т.к. мы не можем обратиться к элементу (как в массиве) мы пробегаемся по списку, начиная с head
           while(nodeNext.next != null) {
               nodeNext = nodeNext.next;
           }
           nodeNext.next = node;
        }
    	
    	return head;
        //Complete this method
    }

	public static void display(LinkedListTask head) {
        LinkedListTask start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListTask head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

