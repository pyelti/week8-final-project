package drones.iterator;

import drones.DroneTypes;

public class ProductMenuIterator implements Iterator {

	DroneTypes[] productMenu;
	int position;
	
	public ProductMenuIterator(DroneTypes[] productMenu) {
		this.productMenu = productMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > productMenu.length || productMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public DroneTypes next() {
		
		DroneTypes productMenuPos = (DroneTypes) productMenu[position];
		position = position +1;
		
		return productMenuPos;
	}

}



