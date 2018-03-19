package by.htp.divination.logic;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import by.htp.divination.bean.Divination;

public class DivinationTypeTest {

	private FortuneTeller fortuneteller;
	
	@Before
	public void initTestData(){
		fortuneteller = new FortuneTeller();
	}
	
	@Test
	public void positivPetalCountTest() {
		
		Divination divination = fortuneteller.chooseDivination();
		LinkedList<Divination> divinationsTest = new LinkedList<>();
		divinationsTest.add(new Divination("Money", "Become the second Bill Gates", "Become homeless", "Be corporate clerk your entire life"));
		divinationsTest.add(new Divination("Love", "Scarlett Johansson will be your girlfriend", "Brad Pitt will be your boyfrend", "You'll live with mom your entire life "));
		divinationsTest.add(new Divination("Health", "You'll live 500 years", "You'll live 80 years", "Uhps, time is over"));
		
		for(Divination divinationTest: divinationsTest) {
			if(divinationTest.getTitle().equals(divination.getTitle())){
				assertEquals(divinationTest, divination);
			}
		}
	}
}
