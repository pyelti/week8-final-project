package drones.test;

import drones.*;
import drones.iterator.Iterator;
import drones.iterator.ProductMenu;

public class IteratorUnitTest {
	public static void main(String[] args) {
		ProductMenu productMenu = new ProductMenu();
		Iterator iterator = productMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
