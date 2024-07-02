package Exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalProjectTest {
	FinalProject finalProject = new FinalProject();
	
	@Test
	public void testAssertNotNull() {
		assertNotNull("Not null", finalProject);
	}
	
	@Test
	public void testThankYou() throws InterruptedException {
		assertEquals("THANK YOU FOR YOUR ORDER", finalProject.submit());
	}
}
