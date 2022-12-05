package Com.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {
	
	String username = "sathish777";
	
	@Test
	public void testUserName() {
		System.out.println("Testing if user name matching");
		assertEquals("sathish777",username);
	}
	
	@Test
	public void JunitMethod() {
		System.out.println("Test File executed");
	}
	
	public static void main(String[] args) {
		JunitClass results = new JunitClass();
		results.testUserName();
		
	}

}
