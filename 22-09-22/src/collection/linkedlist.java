package collection;
import java.util.*;

public class linkedlist {

	
	      public static void main(String args[])
	      {
	             // create a linked list
	             LinkedList<String> ll = new LinkedList<String>();
	             System.out.println("Initial size of LinkedList: "+ll.size());
	     
	             // add elements to the linked list
	             ll.add("Pune");
	             ll.add("Mumbai");
	             ll.add("Delhi");
	             ll.add("Noida");
	             System.out.println("Element of LinkedList: " + ll);
	             System.out.println("Size of LinkedList after addition: "+ll.size());

	             // remove elements from the linked list
	             ll.remove(2);
	             System.out.println("Element of LinkedList after deletion: " + ll);
	             System.out.println("Size of the LinkedList after deletion: "+ll.size());
	      
	             // remove first and last elements
	             ll.removeFirst();
	             ll.removeLast();
	             System.out.println("ll after deleting first and last: " + ll);
	             System.out.println("Size of the LinkedList after deletion: "+ll.size());
	     
	             //Retriving First and Last element
	             System.out.println("Fisrt element of LinkedList: "+ll.getFirst());
	             System.out.println("Last element of LinkedList: "+ll.getLast());

	             Iterator<String> itr = ll.iterator();
	             while(itr.hasNext())
	             {
	                   System.out.print(itr.next()+", ");
	             }
	      }
	}

