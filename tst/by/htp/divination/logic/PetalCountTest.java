package by.htp.divination.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.htp.divination.bean.Chamomile;

public class PetalCountTest {

	private FortuneTeller fortuneteller;
	
	@Before
	public void initTestData(){
		fortuneteller = new FortuneTeller();
	}
	
	@Test
	public void positivPetalCountTest() {

		for(Chamomile chamomile: fortuneteller.getChamomiles()) {
			if(chamomile.getPetals().size() < 5 || chamomile.getPetals().size() > 10) {
				fail("Incorrect number of petals");
			}
		}
	}
}
