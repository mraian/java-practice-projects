package demo4;

import java.util.Random;
import java.util.Vector;

public class passenger extends Thread {
	int ID;
	int rideCount;
	public static long time = System.currentTimeMillis();
	
	passenger (int id){
		ID =id;
	}
	
	public void run(){
		rideCount++;
		System.out.println("[" + (System.currentTimeMillis() - time) + "] " + "Passenger "+ ID + " running and his total ride so far "+ rideCount);
		
		Random rand = new Random();
		int num = rand.nextInt(10-6)+ 6;
		//int a = 5;
		//int b = 10;
		Thread.currentThread().setPriority(num);
	}

	public static void rideEndMassage( Vector <passenger> vPass){
		
		
		System.out.println("car came back from the tour");
		System.out.println();
		
		for (int i=0; i<4; i++) {
			System.out.println("[" + (System.currentTimeMillis() - time) + "] " + "Passenger"+ vPass.get(0).ID+ " is getiing out of the car");
			
			vPass.addElement(vPass.remove(0));
			//vPass.remove(0);
		}
	}
	
}
