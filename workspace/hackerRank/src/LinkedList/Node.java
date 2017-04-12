package LinkedList;

public class Node<D> {
	// properties
	Node<D> next;
	D data;
	
	// constructors
	public Node(D newData){
		data = newData;
		next = null;
	}
	
	public Node(D newData, Node<D> link){
		data = newData;
		next = link;
	}

	// getters and setters
	public Node<D> getNext(){
		return next;
	}
	
	public D getData(){
		return data;
	}
	
	public void setNext(Node<D> link){
		next = link;
	}
	
	public void setData(D newData){
		data = newData;
	}
}
