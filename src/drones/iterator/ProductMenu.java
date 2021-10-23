package drones.iterator;

import drones.DroneTypes;
import drones.FixedWing;
import drones.FixedWingHybrid;
import drones.MultiRotor;
import drones.SingleRotor;

public class ProductMenu {
	int numberOfItems = 0;
	DroneTypes[] productMenu;
	
	public ProductMenu() {
		
		productMenu = new DroneTypes[6];
		
		productMenu[0] = new MultiRotor();
		productMenu[1] = new FixedWing();
		productMenu[2] = new SingleRotor();
		productMenu[3] = new FixedWingHybrid();
	}
	
	public Iterator createIterator() {
		return new ProductMenuIterator(productMenu);
	}

}



