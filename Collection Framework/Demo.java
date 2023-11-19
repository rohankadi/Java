import java.util.*;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1000);
		al.add(2000);
		al.add(3000);  
		
		 //List<Integer> ref = new ArrayList();
		
		//Print operation
		Printing.printList(ll);
		Printing.printList(al);
	}

}
