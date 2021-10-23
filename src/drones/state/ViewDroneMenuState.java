package drones.state;

import drones.factory.MenuFactory;

public class ViewDroneMenuState implements State {

	@Override
	public void status(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();		
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
