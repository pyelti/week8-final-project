package drones.main;

import drones.state.Context;
import drones.state.MainMenuStatus;

public class Home {
	public static void main(String[] args) {
		Context context = new Context();
		
		MainMenuStatus startUp = new MainMenuStatus();
		startUp.status(context);
	
	}

}
