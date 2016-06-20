package testy;

import static org.junit.Assert.*;

import java.awt.TextArea;

import javax.swing.JTextArea;

import org.junit.Before;
import org.junit.Test;

import ourMethod.Clear;

public class ClearTest {

	Clear clear;
	JTextArea textArea;
	TextArea text;
	
	@Before
	public void setUp() throws Exception {
		textArea = new JTextArea();
		text = new TextArea();
		clear = new Clear(textArea, text);
	}

	@Test
	public final void test() {
		assertNotNull(clear);
	}
	
	@Test
	public final void testClearEvents(){
		clear.ClearEvents();
		assertEquals("", text.getText());
	}
	
	@Test
	public final void testClearTitle(){
		clear.CleartTitle();
		assertEquals(" ", textArea.getText());
	}

}
