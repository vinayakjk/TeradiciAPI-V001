package com.teradici.basePkg;

import org.testng.annotations.*;

public class TC1 {

	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("This method execute BEFORE Test Annotation ...");
	}
	
	@AfterTest
	void AfterTest()
	{
		System.out.println("This method execute AFTER TEST Annotation..");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("This method execute BEFORE METHOD..");
	}
	
	@AfterClass
	void AfterClass()
	{
		System.out.println("This method execute AFTER CLASS..");
	}
	
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This method execute BEFORE CLASS..");
	}
	
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("This method execute AFTER METHOD..");
	}
	
	
	@Test (priority=1,enabled=true)
	void test1()
	{
		System.out.println("This is test 1..");
	}
	
	
	
	@Test()
	void test2()
	{
		System.out.println("This is test 2..");
	}

	
	
	
}
