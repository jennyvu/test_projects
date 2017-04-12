package Queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey<T>{
	
	LinkedList<T> queuey;
	
	public Queuey(){
		queuey = new LinkedList<T>();
	}
	
	public boolean isEmpty(){
		return queuey.isEmpty();
	}

	public int size(){
		return queuey.size();
	}
	
	public void enqueue(T n){
		queuey.addLast(n);
	}
	
	public T dequeue(){
		return queuey.remove(0);
	}
	
	public T peek(){
		return queuey.get(0);
	}
	
	public static void main(String[] args) {
		
		Queuey<Integer> numberQueue = new Queuey<Integer>();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		System.out.println("First item out: "+ numberQueue.dequeue());
		numberQueue.enqueue(10);
		System.out.println("Second item out: "+ numberQueue.dequeue());
		
		Stack<String> stacky = new Stack<String>();
		stacky.push("There");
		stacky.push("Hi");
		System.out.println("Stack peek "+stacky.peek());
		System.out.println(stacky.pop() + " "+stacky.pop()+"!");
	}

}
