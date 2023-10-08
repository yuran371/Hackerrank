package Day_15;

import java.util.Scanner;

// Лучшее объяснение работы LinkedList, а в частности вложенного класса Node
public class Node {
	int data;
	Node next;
	
	Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  Node insert(Node head,int data) {
    	Node node = new Node(data);
    	if(head == null) {
            head = node;
        } else {
           Node nodeNext = head;	//т.к. мы не можем обратиться к элементу (как в массиве) мы пробегаемся по списку, начиная с head
           while(nodeNext.next != null) {
               nodeNext = nodeNext.next;
           }
           nodeNext.next = node;
        }
    	
    	return head;
        //Complete this method
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

