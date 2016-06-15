package ourMethod;

import javax.swing.JTextArea;


public class Clear {
	private JTextArea tTitle_handle;
	private JTextArea tEvent_handle;
	private JTextArea tDateStart_handle;
	private JTextArea tDateEnd_handle;
	public Clear(JTextArea tTitle,JTextArea tEvent,JTextArea tDateStart,JTextArea tDateEnd){
	tTitle_handle = tTitle;
	tEvent_handle = tEvent;
	tDateStart_handle = tDateStart;
	tDateEnd_handle = tDateEnd;
	}
	

public  void CleartTitle() {
	tTitle_handle.setText(" ");
	tEvent_handle.setText(" ");
	tDateStart_handle.setText(" ");
	tDateEnd_handle.setText(" ");
}
}
