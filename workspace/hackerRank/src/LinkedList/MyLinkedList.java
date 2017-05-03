package LinkedList;

import java.util.LinkedList;

public class MyLinkedList<D> {
	// properties
	Node<D> head;
	int count;
	
	// constructors
	public MyLinkedList(){
		head = null;
		count = 0;
	}
	
	public MyLinkedList(Node<D> node){
		head = node;
		count = 1;
	}
	
	// method
	public void add(D newData){
		Node<D> temp = new Node<D>(newData);
		Node<D> current = head;
		if(head == null){
			//head.data = newData;
			//head.next = null;
			head = temp;
			count++;
		}else{
			while(current.getNext() != null){
				current.getNext();
			}
			current.setNext(temp);
			count++;
		}
	}
	
	public D get(int index){
		Node<D> current = head;
		if(index <= 0 || head == null){
			return null;
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
			Node<D> current = head;
			while(current.getNext().getNext() != null){
				current = current.getNext();
			}
			current.setNext(null);
			count--;			
		}	
	}
	
	Node<D> Reverse(Node<D> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<D> newHead = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	Node<D> RemoveDuplicate(Node<D> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<D> newHead = head;
		while(head.next != null) {
			if (head.data != head.next.data) {
				head = head.next;
			} else {
				head.next = head.next.next;
			}		
		}
		return newHead;
	}
	
	public String toString(){
		String str = "[";
		while(head != null){
			str += head.getData();
			if(head.getNext() != null){
				str += " ";
			}
			head = head.getNext();
		}
		str += "]";
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Alex");
		System.out.println(linkedlist);
		linkedlist.add("Steve");
		System.out.println(linkedlist);
		MyLinkedList<String> mylist = new MyLinkedList<String>();
		mylist.add("Hi");
		mylist.add("There!");
		System.out.println(mylist);
	}
}
