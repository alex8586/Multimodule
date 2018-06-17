package com.two.manager.impl;

import com.helper.manager.CountHelper;
import com.helper.manager.impl.CountHelperImpl;
import com.two.manager.CountManager;

public class CountManagerImpl implements CountManager {

	private CountHelper helper;

	public CountManagerImpl() {
		this.helper = new CountHelperImpl();
	}

	public int add(int first, int second) {
		return helper.add(first, second);
	}

	public int subtract(int first, int second) {
		return helper.subtract(first, second);
	}

	public int multiply(int first, int second) {
		return helper.multiply(first, second);
	}

	public int divide(int first, int second) {
		return helper.divide(first, second);
	}

}