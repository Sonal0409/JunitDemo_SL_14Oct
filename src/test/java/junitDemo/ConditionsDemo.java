package junitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionsDemo {
	
	

	@Test
	@DisplayName("code to test add")
	@EnabledOnOs(OS.LINUX)
 public	void addtest() {
		
		Mycode obj= new Mycode();
		int exp = 30;
		int act=obj.add(10, 20); 
		// validate of exp and act are equal:
		// if they are equal junit will pass the test
		// if they dont then junit wil fail
	assertEquals(exp,act);
		
	}
	

}
