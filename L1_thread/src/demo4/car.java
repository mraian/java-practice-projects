package demo4;

import java.util.Vector;

public class car extends Thread {
//	static int vSize;
//	static int pCapacity;
	static int P;
	static Vector<passenger> v = new Vector <passenger>();
	int ID;
	
	car(int id) {
		ID = id;
	}
	
	public static void initPassenger(Vector<passenger> vList, int capacity){
		P = capacity;
//		vSize =n;
//		v = new Vector <passenger>(14);
		v = vList;
		System.out.println(v.size());
//		pCapacity =p;
		//Vector<passenger> v = new Vector <passenger>( 11);
		
/*		for(int i = 0; i < n; i++){
			
			passenger _p = new passenger(i+1);
			
			v.addElement(_p);;
			
		}*/
	}
	
	
	public void run(){
		
		if (v.size() >= P) {
			
			for (int i=0; i<4; i++){
				v.get(i).start();
				//v.remove(0);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("-----");
				
				passenger.rideEndMassage(v);
				System.out.println("vector size "+ v.size());
				System.out.println("\n\tTour over");
				//e.printStackTrace();
			}
		}	
			else
				System.out.println("Opps not enough passenger.");
		
		
	}
	
	
	
}
