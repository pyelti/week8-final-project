package drones.iterator;

import drones.DroneTypes;
import drones.facade.PrintMenus;

public class PrintProductMenu implements PrintMenus {
	ProductMenu productMenu;
	DroneTypes droneTypes;
	
	public PrintProductMenu(ProductMenu productMenu) {
		this.productMenu = productMenu;
	}
	
	public void printMenu() {
		Iterator iterateProductMenu = productMenu.createIterator();
		printMenu(iterateProductMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------Types of Drones MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			DroneTypes  droneTypes= (DroneTypes) iterator.next();
			  
			  System.out.print(droneTypes.getDroneName() + "\t");
			  System.out.print(droneTypes.getEndurance()+"\t");
			  System.out.print(droneTypes.getFlightType()+"\t");
			  System.out.println(droneTypes.getDescription()+"\t");

			
		}
		 
	}
}






