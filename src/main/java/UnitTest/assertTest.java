package UnitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class assertTest {
	
	@Test
	public void assertEqualsTest() {
		int result = add(3,3);
		
		assertEquals(5,result);
	}
	
	public Integer add(int x, int y) {
		return x+y;
	}
	
}
