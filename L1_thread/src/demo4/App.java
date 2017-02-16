package demo4;

import java.util.Vector;

public class App {
	
	public static long time = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		int nPass =11;	 	//default size for passenger
		int nCar =3;		//default size for car
		int P	=4; 	//each car can take 4 passenger	
		
	//	Scanner input = new Scanner(System.in);
//		System.out.println("Please chose from the following menu :");
//		System.out.println("\tPress 1 : To use default parameter for car and passenger size");
//		System.out.println("\tPress 2 : For manual input for car and passenger size");
		
//		int answer = input.nextInt();
	/*	
		if(answer==2){
			System.out.println("Please input the number of passenger");
			nPass=input.nextInt();
			System.out.println("Please input the number of car");
			nCar=input.nextInt();
			System.out.println("Enter the passenger number that each car take at a single ride ");
			p= input.nextInt();
		}*/
		Vector<car> carVector = new Vector<car> (nCar);
		Vector<passenger> passVector = new Vector <passenger>(nPass);
		
		
		for (int i=0; i < nPass; i++) {
			passenger pass = new passenger(i + 1);
			passVector.addElement(pass);
			//
		}
			
		
		car.initPassenger(passVector, P);
		
		for (int i=0; i < nCar; i++) {
			car c = new car(i + 1);
			carVector.addElement(c);
		}
		
		int j = 0;
		
		for(int i =0; i< nCar; i++){
//			car c1 = new car(i+1);
			System.out.println("\n[" + (System.currentTimeMillis() - time) + "] " + "Car: " + (i+1) + " is ready to run, but waiting for passenger to get in");
			carVector.get(i).start();
			//System.out.println("Car "+ (i+1) + " is on tour");
			
		//	c1.start();
			
			try {
				Thread.sleep(1000);			
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			carVector.get(i).interrupt();
			
			try {
				//c1.join();

				carVector.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}	
	}
	
	
}
