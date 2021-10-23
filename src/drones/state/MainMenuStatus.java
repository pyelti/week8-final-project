package drones.state;

import java.util.Scanner;

public class MainMenuStatus implements State{

	@Override
	public void status(Context context) {
	Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------Drone Traffic Management System-----\n" + 
		"1) Drones \n" + 
		"2) Logout\n");
		
		System.out.print("");

		int DroneInpt = usrInpt.nextInt();
		
		if(DroneInpt ==1) {
			ViewDroneMenuState viewDrones = new ViewDroneMenuState();
			viewDrones.status(context);
		}
		
			
		else {
			System.exit(0);
		}
		
		
	context.setState(this);
	}

	@Override
	public void findCause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extinguish() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
