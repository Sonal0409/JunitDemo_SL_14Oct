package junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class TagDemo {
	
	@Tag("unittesting")
	@Test
	public void test1()
	{
		System.out.println("unittesting1");
	}
	
	@Tag("unittesting")
	@Test
	public void test2()
	{
		System.out.println("unittesting2");
	}
	
	@Tag("AcceptanceTesting")
	@Test
	public void test3()
	{
		System.out.println("Acceptancetesting");
	}
	
	
	

}
