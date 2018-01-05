import static org.junit.Assert.*;

import org.junit.Test;

public class CookieOrderTest {
	//https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/exercises/cookie-orders.md
	
	@Test
	public void shouldBeAbleToCreateACookieOrder() { //??? Research "void methods". 
		CookieOrder underTest = new CookieOrder (" ", 0);
		assertNotNull(underTest); // The assertion is that there is something here. There is something here so the test passes (Ctrl+r). 
	}
	@Test
	public void assertThatGetNumBoxesReturnsOne () {
		CookieOrder underTest = new CookieOrder (" ", 1);
		int check = underTest.getNumBoxes();
		assertEquals(1, check); //check is the value that you get back when you getNumBoxes. 
	}
	
	@Test
	public void assertThatGetVarietyMatchesUp() {
		CookieOrder underTest = new CookieOrder ("test", 1);
		String check = underTest.getVariety();
		assertEquals("test", check);
	}
	
	@Test
	public void assertThatGetTotalBoxesReturnsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder ("test", 1));
		int check =underTest.getTotalBoxes();
		assertEquals(check, 1);
	}
	
	@Test
	public void assertThatGetTotalBoxesReturnsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder ("test1", 1));
		underTest.addOrder(new CookieOrder ("test2", 1));
		int check =underTest.getTotalBoxes();
		assertEquals(check, 2);
	}
	@Test
	public void assertThatRemoveVarietyRemovesAnItem() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder ("test1", 1));
		underTest.addOrder(new CookieOrder ("test2", 1));
		underTest.removeVariety("test3");
		int check = underTest.getSize();
		assertEquals(check, 2);
}
}
