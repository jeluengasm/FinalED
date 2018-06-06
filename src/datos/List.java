package datos;

import java.io.*;
/**
 * @author Estudiante
 *
 */
public class List {

	Node head = null;
	
	public boolean isEmpty()
	{
		return head == null ? true : false;

	}
	
	public int length()
	{
		int counter = 0;
		Node temp = head;
		while(temp != null)
		{
			counter += 1;
			temp = temp.next;
		}
		return counter;
	}
	
	public Node get(int index)
	{
		if(index < this.length())
		{
			Node temp = head;
			for(int i = 0; i < index; i++)
				temp = temp.next;
			
			return temp;
		}
		return null;
	}
	
	public void printList()
	{
		BufferedWriter bw = new BufferedWriter( 
				new OutputStreamWriter( System.out ));
		Node temp = head;
		
		try
		{
			bw.write("Grades:\n");
			while(temp != null)
			{
				bw.write(temp.toString());
				temp = temp.next;
			}
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
	
	public void insertAtBegin(Node newNode)
	{
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(Node newNode)
	{
		if(isEmpty())
			head = newNode;
		else
		{
			Node temp = head;
			
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = newNode;
		}
	}
	
	public void insertAtIndex(Node newNode, int index)
	{
		Node temp = head;
		
		for(int i = 0; i < index - 1; i++)
			temp = temp.next;
		
		newNode.next = temp.next;
		temp.next = newNode; 
	}
	
	public void deleteAtBegin()
	{
		Node temp = head;
		head = head.next;
		temp = null;
		System.gc();
	}
	
	
	public void deleteAtIndex(int index)
	{
		Node temp = head;
		Node toDelete;
		
		for(int i = 0; i < index - 1; i++)
			temp = temp.next;
		
		toDelete = temp.next; 
		temp.next = temp.next.next;
		toDelete = null;
		System.gc();
	}
	
	

	
//	public Node binarySearch(int value, int lowerBound, int upperBound)
//	{
//		int middleElement = (lowerBound + upperBound) / 2;
//		int tempId = get(middleElement).id;
//		if(lowerBound == upperBound)
//			if(tempId == value)
//				return get(middleElement);
//			else
//				return null;
//		else
//			if(tempId == value)
//				return get(middleElement);
//			else
//				if(value < tempId)
//					return binarySearch(value, lowerBound, middleElement);
//				else
//					return binarySearch(value, middleElement + 1, upperBound);
//	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List Ben = new List();
                Horario h1 = new Horario("Lunes, Sábado",
                        "Lunes, Jueves, Viernes, Sábado",
                        "Lunes, Martes, Jueves, Viernes, Sábado",
                        "Lunes, Martes, Miércoles, Viernes",
                        "Miércoles, Viernes",
                        "Miércoles, Jueves, Viernes, Sábado",
                        "Miércoles, Jueves, Sábado",
                        "Jueves, Sábado",
                        "Lunes, Viernes",
                        "Lunes, Jueves, Viernes, Sábado",
                        "Lunes, Jueves, Viernes, Sábado",
                        "Jueves");
                Beneficiario e1 = new Beneficiario("Jhon Esteban", "Luengas Machado", "25481024", "jeluengasm@unal.edu.co", h1);
                Beneficiario e2 = new Beneficiario("Jhon ", " Machado", "1534534", "esfrf@unal.edu.co", h1);
                List Lider = new List();
		Ben.insertAtBegin(new Node(e1));
                Ben.insertAtBegin(new Node(e2));
		System.out.print(Ben.get(1).Ben.getApellidos() + " ");
                System.out.println(Ben.get(1).Ben.getNombres());
                System.out.println(Ben.length());
                System.out.println(Ben.get(1).Ben.getHorario().getEighteen());
                
		//grades.deleteAtIndex(2);
//		grades.printList();
//		Node search = grades.binarySearch(7, 0, grades.length() - 1);
//		
//		if(search != null)
//			System.out.println("Elemento encontrado. " + search.toString());
//		else
//			System.out.println("El elemento no se encuentra");
		
	}
}
