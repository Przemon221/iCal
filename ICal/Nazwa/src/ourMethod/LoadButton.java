package ourMethod;

import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import start_window.IcalWindow;

@SuppressWarnings("serial")
public class LoadButton extends JFrame {

	JTextArea textArea = new JTextArea();
	JFileChooser fileChooser = new JFileChooser();
	public StringBuilder sb = new StringBuilder();
	IcalWindow icalWindow = new IcalWindow();

	// wybor plikow
	public void chooseFile() throws Exception {

		if (fileChooser.showOpenDialog(null) == JFileChooser.FILES_ONLY) {
			java.io.File file = fileChooser.getSelectedFile();
			 Scanner input = new Scanner(file);
			while (input.hasNext()) {
				sb.append(input.nextLine());
				sb.append("\n");
			
			}
			input.close();
		} else {
			sb.append("No file wos selected");
		}

	}

	
	

	
	

}
