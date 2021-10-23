package drones.test;

import drones.*;
import drones.factory.MenuFactory;
import drones.state.Context;

public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

	}
}
