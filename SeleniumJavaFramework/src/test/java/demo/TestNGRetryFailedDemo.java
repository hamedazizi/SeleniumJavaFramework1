package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
		int i=1/0;
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
	}
	
	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am inside test 3");
		Assert.assertTrue(0>1);
	}
	
}
