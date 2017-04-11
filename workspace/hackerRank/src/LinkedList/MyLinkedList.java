package LinkedList;

import java.util.LinkedList;

public class MyLinkedList {
	// properties
	Node head;
	int count;
	
	// constructors
	public MyLinkedList(){
		head = null;
		count = 0;
	}
	
	public MyLinkedList(Node node){
		head = node;
		count = 1;
	}
	
	// method
	public void add(int newData){
		Node temp = new Node(newData);
		Node current = head;
		if(head == null){
			current.data = newData;
			current.next = null;
			head = current;
			count = 1;
		}else{
			while(current.getNext() != null){
				current.getNext();
			}
			current.setNext(temp);
			count++;
		}
	}
	
	public int get(int index){
		Node current = head;
		if(index <= 0 || head == null){
			return -1;
		}
		for(int i = 1; i<index; i++){
			current = current.getNext();
		}
		return current.getData();
		
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void remove(){
		//remove from back of list
		// if only node in the list
		if(head.getNext() == null){
			head = null;
			count = 0;
		}
		else{
			Node current = head;
			while(current.getNext().getNext() != null){
				current = current.getNext();
			}
			current.setNext(null);
			count--;			
		}	
	}
	
	Node Reverse(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node newHead = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Alex");
		System.out.println(linkedlist);
		linkedlist.add("Steve");
		System.out.println(linkedlist);
	}

}
