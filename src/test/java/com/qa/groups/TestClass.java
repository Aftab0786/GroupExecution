package com.qa.groups;

import org.testng.annotations.Test;

public class TestClass {

	@Test(groups= {"sanity"})
	public void Test01() {
		System.out.println("I am in Goa");
	}

	@Test(groups= {"smoke"})
	public void Test02() {
		System.out.println("I am in Banglore");
	}

	@Test(groups= {"sanity","smoke"})
	public void Test03() {
		System.out.println("I am in Pune");
	}

	@Test(groups= {"smoke"})
	public void Test04() {
		System.out.println("I am in Patna");
	}

	@Test
	public void Test05() {
		System.out.println("I am in Nepal");
	}
}