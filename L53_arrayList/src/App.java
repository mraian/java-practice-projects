import java.util.ArrayList;

public class App {
 
	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(101);
		
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
			
		numbers.remove(numbers.size()-1);
		

		for(int i1=0; i1<numbers.size(); i1++)
			System.out.println(numbers.get(i1));
				
		}
	}
}
