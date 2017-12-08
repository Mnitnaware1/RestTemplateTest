package com.main.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.main.controller.SampleController;

public class SampleTest {	

	SampleController controller;

	@Before
	public void setUp() throws Exception {
		controller = new SampleController();
	}

	@Test
	public void test_namePass() {
		// incoming name is match with actual
		assertEquals(controller.getMyName(), "samplename");
	}
	

	@Test
	public void test_nameFail() {
		// incoming name is not-match with actual
		assertEquals(controller.getMyName(), "sample");
	}

}
