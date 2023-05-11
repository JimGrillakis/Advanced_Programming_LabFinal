package gr.upatras.junit.first;




import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;



class SubtractTest {

			@Test
			void testExceptionIsThrown() {
				Subtract tester = new Subtract();
				assertThrows(IllegalArgumentException.class, () -> tester.sub(10,10));
		}
		    @Test
		    void testsubtractionPositive() {
		    	Subtract tester = new Subtract();
		    	assertEquals("POSITIVE", tester.sub(10, 5), "10 - 5 must be POSITIVE");
		
		}
		    @Test
		    void testsubtractionNegative() {
		    	Subtract tester = new Subtract();
		    	assertEquals("NEGATIVE", tester.sub(2, 5), "2 - 5 must be NEGATIVE");
		
		}



}



