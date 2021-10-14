package junitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("code to Test mathUtils")
public class MycodeTest {

	@BeforeAll
	public  void start()
	{
		System.out.println("first method to be executed");
	}
	
	
	@BeforeEach
	public void setup()
	{
		System.out.println("start test");
	}
	
	
	@Test
	@DisplayName("code to test add")
 public	void addtest() {
		
		Mycode obj= new Mycode();
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
		Mycode obj = new Mycode();
		int exp =6;
		int act = obj.multiply(2, 3);
		assertEquals(exp,act);
	}
	

	@Test
	@DisplayName("code to test division")
	public void dividetest()
	{
		Mycode obj = new Mycode();
	
		assertThrows(ArithmeticException.class, () -> obj.divide(6, 0));
	
		
	}
	
	
	@AfterEach
	public void close() {
		System.out.println("After every test");
	}
	
	@AfterAll
	public void end()
	{
		System.out.println("after all methods");
	}
	
	
	
	
	
	

}
