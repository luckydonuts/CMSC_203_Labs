/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Lab 3 JUnit
 * Due: 10/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(100);
		g2.addScore(300);
	} 

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("100.0 300.0 "));
	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum(), .0001);
		assertEquals(400, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
		assertEquals(100, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75, g1.finalScore(), .0001);
		assertEquals(300, g2.finalScore(), .0001);
	}
}
