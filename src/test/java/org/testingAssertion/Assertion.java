package org.testingAssertion;

public class Assertion {
	
	public static void assertContains(String actual, String expected)
	{
		if(actual.contains(expected))
		{
			System.out.println("Assertion is passed !");
		}
		else
		System.out.println("Assertion is failed !");
	}
	
	public static void assertEqualsIgnoreCase(String actual, String expected)
	{
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Assertion is passed !");
		}
		else
		System.out.println("Assertion is failed !");
	}

}
