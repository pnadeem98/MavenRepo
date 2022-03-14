package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	@Test
	public void testadd() {
		
		Calculator c= new Calculator();
		
		int r= c.add(13,12);
		
		Assertions.assertEquals(25,r);
	}
}
