package ourMethod;

import java.awt.TextArea;

import javax.swing.JTextArea;

public class Clear {
	private JTextArea tTitle_handle;
	TextArea events_handle;

	public Clear(JTextArea tTitle, TextArea tEvents) {
		tTitle_handle = tTitle;
		events_handle = tEvents;
		
	}
	public void ClearEvents () {
		events_handle.setText("");
	}

	public void CleartTitle() {
		tTitle_handle.setText(" ");
	}
}
