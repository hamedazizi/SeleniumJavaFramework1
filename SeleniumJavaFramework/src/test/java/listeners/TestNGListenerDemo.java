package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("i am inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("i am inside Test 2");
		Assert.assertTrue(false);//if you want to dileberately fail a test
	}
	@Test
	public void test3() {
		System.out.println("i am inside Test 3");
		throw new SkipException("This test is inside skipped");
	}
	

}
