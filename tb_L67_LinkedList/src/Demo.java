import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	
	public static void main(String []args){
		
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		placesToVisit.add("North Carolina");
		placesToVisit.add("North dakota");
		placesToVisit.add("South Carolina");
		placesToVisit.add("South Dakata");
		placesToVisit.add ("LA");
		
		
		printList(placesToVisit);
	}
	private static void printList (LinkedList<String>linkedList){
		Iterator<String> i = linkedList.iterator();
		
		while ( i.hasNext()){
			System.out.println("Now visiting" + i.next());
			
			
		}
	
		System.out.println("----------------");
		
		
	}
}
