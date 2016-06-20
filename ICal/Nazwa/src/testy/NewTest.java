package testy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ourMethod.New;

public class NewTest {

	New klasa;
	String start, end, title;
	
	@Before
	public void setUp() throws Exception {
		start = "start";
		end = "end";
		title = "title";
		klasa = new New(start, end, title);
	}

	@Test
	public final void testNotNull() {
		assertNotNull(klasa);
	}
	
	@Test
	public final void testGetStart(){
		assertEquals(start, klasa.getDateStart());
	}

	@Test
	public final void testGetEnd(){
		assertEquals(end, klasa.getDateEnd());
	}
	
	@Test
	public final void testGetTitle(){
		assertEquals(title, klasa.getTitle());
	}
}
