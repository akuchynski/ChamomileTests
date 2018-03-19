package by.htp.divination.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GetDivinationTest {

	private FortuneTeller fortuneteller;
	
	@Before
	public void initTestData(){
		fortuneteller = new FortuneTeller();
	}
	
	@Test
	public void positivGetDivinationTest() {
		
		assertNotNull(fortuneteller.chooseDivination());
	}
}
