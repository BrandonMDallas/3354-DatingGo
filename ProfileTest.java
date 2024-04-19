package Programming;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void AgeTest() {
		Profile junit = new Profile();
		/*
		 * Test Case Age 17
		 */
		assertEquals("Test Case: Age 17", false, junit.validAge(17));
		/*
		 * Test Case Age 21
		 */
		assertEquals("Test Case: Age 21", true, junit.validAge(21));
		/*
		 * Test Case Age 121
		 */
		assertEquals("Test Case: Age 122", false, junit.validAge(121));
	}

}
