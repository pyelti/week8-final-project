package drones.factory;

import java.util.Scanner;

import drones.iterator.PrintProductMenu;
import drones.iterator.ProductMenu;
import drones.state.Context;
import drones.state.DroneMngmtStates;
import drones.state.MainMenuStatus;



public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Types of Drones\n"+
		"2) Drone Traffic Management\n"+
		"3) Home Screen" );
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			ProductMenu productmenu = new ProductMenu();
			PrintProductMenu prntpmnu = new PrintProductMenu(productmenu);
			
			prntpmnu.printMenu();
		}
		if(menuChoice ==2) {
			DroneMngmtStates states = new DroneMngmtStates();

			System.out.println(states);
			states.findCause();
			System.out.println(states);
			states.findLocation();
			System.out.println(states);
			states.deliver();
			System.out.println(states);

			states.extinguish();

			System.out.println(states);


			
		}
			
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.status(context);
		}
		
		
		
		
		Context context = new Context();
		
		
	}
}






