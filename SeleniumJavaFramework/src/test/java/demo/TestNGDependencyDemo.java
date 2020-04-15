package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods= {"test2"})
	public void test1() {
		System.out.println("i am inside test 1 ");
	}
	
	@Test
	public void test2() {
		System.out.println("i am inside test 2 ");
	}
}
