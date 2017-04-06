package LinkedList;

public class Node {
	// properties
	Node next;
	int data;
	
	// constructors
	public Node(int newData){
		data = newData;
		next = null;
	}
	
	public Node(int newData, Node link){
		data = newData;
		next = link;
	}

	// getters and setters
	public Node getNext(){
		return next;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(Node link){
		next = link;
	}
	
	public void setData(int newData){
		data = newData;
	}
}
