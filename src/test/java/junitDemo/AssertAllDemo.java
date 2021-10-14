package junitDemo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertAllDemo {
	
	@Test
	public void test1()
	{
		Mycode obj = new Mycode();

		assertAll(
		() -> assertEquals(2,obj.add(1,1),"should return correct value"),		
		() -> assertEquals(5,obj.add(2,3),"should return correct value"),
		() -> assertEquals(6,obj.add(2,4),"should return correct value")
				);
	}

	@Test
	@Disabled("displabled until defect fixed")
	public void test2()
	{Mycode obj = new Mycode();

	assertAll(
	() -> assertEquals(1,obj.multiply(1,1),"should return correct value"),		
	() -> assertEquals(9,obj.multiply(2,3),"should return correct value")
			);
		
	}
	
	
}




