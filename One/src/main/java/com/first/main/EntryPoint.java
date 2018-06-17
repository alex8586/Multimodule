package com.first.main;

import com.two.manager.CountManager;
import com.two.manager.impl.CountManagerImpl;

public class EntryPoint {

	public static void main(String[] args) {
		CountManager manager = new CountManagerImpl();
		int added = manager.add(5, 7);
		int substracted = manager.subtract(23, 11);
		int multiplied = manager.multiply(4, 7);
		int divided = manager.divide(27, 3);

		System.out.println("5 add 7 = " + added);
		System.out.println("23 subtract 11 = " + substracted);
		System.out.println("4 multiply 7 = " + multiplied);
		System.out.println("27 divide 3 = " + divided);
	}

}
