package Queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {
	
	LinkedList queuey;
	
	public Queuey(){
		queuey = new LinkedList();
	}
	
	public boolean isEmpty(){
		return queuey.isEmpty();
	}

	public int size(){
		return queuey.size();
	}
	
	public void enqueue(int n){
		queuey.addLast(n);
	}
	
	public int dequeue(){
		return (int)queuey.remove(0);
	}
	
	public int peek(){
		return (int)queuey.get(0);
	}
	
	public static void main(String[] args) {
		/*
		Queuey numberQueue = new Queuey();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		int first = numberQueue.dequeue();
		System.out.println("First item out: "+ first);
		numberQueue.enqueue(10);
		System.out.println("Second item out: "+ numberQueue.dequeue());
		*/
		Stack<String> stacky = new Stack<String>();
		stacky.push("There");
		stacky.push("Hi");
		System.out.println("Stack peek "+stacky.peek());
		System.out.println(stacky.pop() + " "+stacky.pop()+"!");
	}

}
