package junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Test nested methods")
public class NestedDemo {
	
	@Test
	public void test1()
	{
		System.out.print("test1");
	}
	
	@Nested
	@DisplayName("nested vehicles methods")
	class vehicles{
	@Test
	public void car()
	{
		System.out.print("car");
	}

	@Test
	public void Bus()
	{
		System.out.print("bus");
	}

	@Test
	public void cycle()
	{
		System.out.print("cycle");
	}

	}
	
	@Nested
	@DisplayName("Nested tests for tools")
	class tools{
		@Test
		public void selenium()
		{
			System.out.print("selenium");
		}
		@Test
		public void jmeter()
		{
			System.out.print("jmeter");
		}
	}
	
	
	
	
	
	
	
}
