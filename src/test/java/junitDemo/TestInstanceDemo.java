package junitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestInstanceDemo {
	
	Mycode obj;
	@BeforeAll
	public void init()
	{
		obj= new Mycode();
	}
	
	@Test
	@DisplayName("code to test add")
 public	void addtest() {
		
		
		int exp = 30;
		int act=obj.add(10, 20); 
		// validate of exp and act are equal:
		// if they are equal junit will pass the test
		// if they dont then junit wil fail
	assertEquals(exp,act);
		
	}
	
	
	@Test
	@DisplayName("code to test multiply")
	public void multest()
	{
	
		int exp =6;
		int act = obj.multiply(2, 3);
		assertEquals(exp,act);
	}
	

}
