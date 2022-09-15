package day4;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.ListIterator;
public class lcode4 {
public static void main(String[] args) {
 

		// TODO Auto-generated method stub
		  // create an empty linked list
		   LinkedList<String> obj3 = new LinkedList<String>();
		 // use add() method to add values in the linked list
		        obj3.add("Monday");
		        obj3.add("Tuesday");
		        obj3.add("Wednesday");
		        obj3.add("Thursday");
		        obj3.add("Friday");
		        obj3.add("Saturday");
		        
		        Iterator<String> iterator = obj3.descendingIterator();//Iterating in reverse order in descending way
		        while (iterator.hasNext()) 
		        {
		            System.out.println(iterator.next());
		        }
		    }
		
		//traversing the linkedlist
		// hasNext() will tell if previous element is
		// available or not
		// next() with descending iterator will return the
		// previous element
		// and after getting the previous element
		// is moves the cursor to next previous element.
	}


