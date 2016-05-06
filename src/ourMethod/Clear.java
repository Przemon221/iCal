package ourMethod;

import javax.swing.JTextArea;


public class Clear {
	//private JTextArea tTitle;
	JTextArea tTitle_handle;
	public Clear(JTextArea tTitle){
	tTitle_handle = tTitle;
	}

public  void CleartTitle() {
	// TODO Auto-generated method stub
	tTitle_handle.setText(" ");
};
}
