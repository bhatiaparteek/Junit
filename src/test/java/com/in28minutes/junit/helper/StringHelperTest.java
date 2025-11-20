package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper helper=new StringHelper();
		assertEquals("ABC",helper.truncateAInFirst2Positions("AABC"));
		assertEquals("BC",helper.truncateAInFirst2Positions("ABC"));
		assertEquals("GBC",helper.truncateAInFirst2Positions("GBC"));

	}

}
