package ep5.Holds2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class HouseTest {
	House h;
	@Before
	public void init()
	{
		h=new House();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2400,h.FullyHomeCost("HighStandardMaterials",2500),0);
		
	}

}
