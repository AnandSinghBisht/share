package com.java8.hackerRank;



public class CycleslinkedList {

	private static class Node
	{
		private int data;
		private Node next;
		Node(int data)
		{
			this.data=data;
		}
	}

	private Node head;
	
	public 	void addtoNode(Node node)
	{
		if(head==null){
			head=node;
		}else
		{
			Node temp=head;
			while(temp.next!=null)
			temp=temp.next;
			
			temp.next=node;
				
			
		}
	}
	
	
public  boolean hasCycle()
{
	if(head==null)
	
	return false;
	
	Node fast=head.next;
	Node slow=head;
	
	
	while(fast!=null && fast.next!=null && slow!=null)
	{
		if(fast==slow){
			return true;
		}
		fast=fast.next.next;
		slow=slow.next;
	}
	return false;	
	
}
public static void main(String[] args) {
	CycleslinkedList list=new	CycleslinkedList();
	Node n=new Node(15);
	list.addtoNode(new Node(5));
	list.addtoNode(new Node(5));
	list.addtoNode(n);
	
	list.addtoNode(new Node(5));
	list.addtoNode(new Node(5));
	list.addtoNode(n);
	
	
	System.out.println(list.hasCycle());
}
}
