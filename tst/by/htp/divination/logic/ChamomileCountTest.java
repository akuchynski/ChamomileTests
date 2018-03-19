package by.htp.divination.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChamomileCountTest {

	private FortuneTeller fortuneteller;
	
	@Before
	public void initTestData(){
		fortuneteller = new FortuneTeller();
	}
	
	@Test
	public void positivChamomilesCountTest() {

		if (fortuneteller.getChamomiles().size() < 5 || fortuneteller.getChamomiles().size() > 10) {
			fail("Incorrect number of chamomiles");
		}
	}
}
