package datos;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Stack {
	Node head = null; //top
	
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	public void push(Node newNode)
	{
		newNode.next = head;
		head = newNode;
	}
	
	
	public String pop()
	{
		Node temp = head;
		head = head.next;
		
		String info = temp.toString(); 
		temp = null;
		System.gc();
		return info;
	}
	
	public String peek()
	{
		Node temp = head;
		String info = temp.toString(); 
		return info;
	}
	
	public void printStack()
	{
		BufferedWriter bw = new BufferedWriter( 
				new OutputStreamWriter( System.out ));
		
		try
		{
			bw.write("Grades:\n");
			while(!isEmpty())
				bw.write(pop());
			
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
	
	public static void main(String[] args) 
	{
		
	}
}
