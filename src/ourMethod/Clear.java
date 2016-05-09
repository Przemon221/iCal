package ourMethod;

import javax.swing.JTextArea;


public class Clear {
	private JTextArea tTitle_handle;
	public Clear(JTextArea tTitle){
	tTitle_handle = tTitle;
	}

public  void CleartTitle() {
	tTitle_handle.setText(" ");
}
}
