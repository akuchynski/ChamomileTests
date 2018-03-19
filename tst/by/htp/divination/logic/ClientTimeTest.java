package by.htp.divination.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientTimeTest {

	private FortuneTeller fortuneteller;
	private Client client;

	@Before
	public void initTestData() {
		fortuneteller = new FortuneTeller();
		client = new Client("TestName", "TestSurname");
	}

	@Test
	public void positivClientTimeTest() {
		
		client.askFortuneTeller(fortuneteller);
		String testString = client.askFortuneTeller(fortuneteller);
		assertTrue(testString == "Sorry budy, I have already told your future, come back tommorow!\n");
	}
}
