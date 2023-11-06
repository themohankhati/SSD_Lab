package lab_4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ProductTest {
	
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
	@CsvSource({"1,1,1","1,2,3","10,20,30"}) //CSV- Comma Separated Value.
	void testParimeter(int sideA, int sideB, int sideC)
	{
		Triangle tri=new Triangle();
		
		//fails
		assertEquals(sideA+sideB+sideC,tri.getPerimeter());
				
	}
	
	

}
