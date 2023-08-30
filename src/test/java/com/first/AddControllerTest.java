package com.first;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddControllerTest {
	

	@Test
	void testAdd() {
		AddController addctrl = new AddController();
		double actual = addctrl.add(10,10);
		double expected = 20;
		assertEquals(expected , actual);
	   	}

	@Test
	void testSub() {
		AddController addctrl = new AddController();
		double actual = addctrl.sub(30,10);
		double expected = 20;
		assertEquals(expected , actual);
	   	}
	

	@Test
	void testMultiply() {
		AddController addctrl = new AddController();
		double actual = addctrl.mul(10,10);
		double expected = 100;
		assertEquals(expected , actual);
	   	
	}

	@Test
	void testDivide() {
		AddController addctrl = new AddController();
		double actual = addctrl.div(10,10);
		double expected = 1;
		assertEquals(expected , actual);
	   	
	}

}
