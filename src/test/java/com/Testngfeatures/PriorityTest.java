package com.Testngfeatures;

import org.testng.annotations.Test;

public class PriorityTest { //invocation count
	@Test(priority = -1)
	public void f() {
		System.out.println("Maven Creation");
	}

	@Test(priority = 2)
	public void f1() {
		System.out.println("Library for testng");
	}

	@Test // if no priority added the that particular test priority value will be 0
	public void f2() {
		System.out.println("Testng Installation");
	}

	@Test(priority = 1,invocationCount = 3)
	public void f3() {
		System.out.println("Testng dependency");
	}
}
