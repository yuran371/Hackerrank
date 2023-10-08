package Day_15;

import java.util.Scanner;

// Лучшее объяснение работы LinkedList, а в частности вложенного класса Node
public class Linked_List {
	int data;
	Linked_List next;
	
	Linked_List(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  Linked_List insert(Linked_List head,int data) {
    	Linked_List node = new Linked_List(data);
    	if(head == null) {
            head = node;
        } else {
           Linked_List nodeNext = head;	//т.к. мы не можем обратиться к элементу (как в массиве) мы пробегаемся по списку, начиная с head
           while(nodeNext.next != null) {
               nodeNext = nodeNext.next;
           }
           nodeNext.next = node;
        }
    	
    	return head;
        //Complete this method
    }

	public static void display(Linked_List head) {
        Linked_List start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Linked_List head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

