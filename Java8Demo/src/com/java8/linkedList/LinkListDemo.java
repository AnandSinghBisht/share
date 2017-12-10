package com.java8.linkedList;

public class LinkListDemo {
	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
		
			this.data=data;
			next=null;
		}
	}
	
	public static void main(String[] args) {
	
		LinkListDemo ls=new LinkListDemo();
		
		ls.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		
		System.out.println(ls.head);
		/* Three nodes have been allocated  dynamically.
        We have refernces to these three blocks as first,  
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */

		ls.head.next=second;
		
		/*  Now next of first Node refers to second.  So they
        both are linked.

     llist.head        second              third
        |                |                  |
        |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  | null |     |  3 | null |
    +----+------+     +----+------+     +----+------+ */

		second.next=third;
		
		/*  Now next of second Node refers to third.  So all three
        nodes are linked.

     llist.head        second              third
        |                |                  |
        |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  |  o-------->|  3 | null |
    +----+------+     +----+------+     +----+------+ */
		
		ls.push(5);
		ls.printList();
		}

	public  void printList() {
		// TODO Auto-generated method stub
		
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
		
	}

	public void push(int newdata)
	{
		 /*  1 & 2: Allocate the Node &
        Put in the data*/

		Node newnode=new Node(newdata);
		/* 3. Make next of new Node as head */
		newnode.next=head;
		/* 4. Move the head to point to new Node */
		head=newnode;
	}
}
