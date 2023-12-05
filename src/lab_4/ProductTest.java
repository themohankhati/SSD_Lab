package lab_4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ProductTest {
	 Triangle triangle=new Triangle();
	@Test
	void defaultConstructor()
	{
		Triangle tri =new Triangle();
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	
	@DisplayName("Test that verifies the equilateral triangle")
	@Test
	void equalConstructor()
	{
		Triangle tri =new Triangle(10);
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"2,2,2", "2,2,2"}) //CSV- Comma Separated Value.
	void testPerimeter(int sideA, int sideB, int sideC)
	{
		Triangle tri=new Triangle();
		
		//if 2 is the length of the sides then it will run
		//if other than 2 is passed then it will show error
		//cause in Triangle class 2 is passed
		assertEquals(sideA+sideB+sideC,tri.getPerimeter());
				
	}
	
	@Test
	void getPerimeterwithEquilateralTringle()
	{
		Triangle tri= new Triangle();
		tri.setSides(5);
		int perimeter =tri.getPerimeter();
		assertEquals(15,perimeter);
	}
	
	@BeforeEach
	void setUp()
	{
        triangle = new Triangle(); // Create a new Triangle object for each repetition

	}
	
//	@RepeatedTest(3)
//	void testPerimeterWithDifferentTriangle()
//	{
//
//		int A=(int) (Math.random()*10+1);
//		int B=(int) (Math.random()*10+1);
//		int C=(int) (Math.random()*10+1);
//
//		triangle.setSides(A,B,C);
//		int expectedPerimeter=A+B+C;
//		int perimeter=triangle.getPerimeter();
//		assertEquals(expectedPerimeter,perimeter);
//	}
//	
	@Test
	void isocelelesTriangle()
	{
		Triangle tri= new Triangle();
		assertFalse(tri.isIsosceles());
	}
	
	
}
