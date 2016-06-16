package ourMethod;

import java.awt.Color;
import start_window.IcalWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Options extends IcalWindow implements ActionListener {
	
	int extension_ical;
	int extension_csv;
	
	JButton bIcalFile,bCsvFile; 
	JTextArea tTitleOptions;
	
	public Options (JButton RefbIcalFile, JButton RefbCsvFile){
		this.bIcalFile = RefbIcalFile;
		this.bCsvFile = RefbCsvFile;
	}
	
	public void actionPerformed(ActionEvent e){
		Object object = e.getSource();
		
		 if (object == bIcalFile){
			 setExtension_ical(1);
			 setExtension_csv(0);
			 System.out.println("Ustawiam Ical");
	     }
		 
		 else if (object == bCsvFile){
			 setExtension_ical(0);
			 setExtension_csv(1);
			 System.out.println("Ustawiam Csv");
		 }
		
    }
	


	public int extension_ical(){

		extension_ical = 1;
		extension_csv = 0;
		
		return extension_ical;
	}
	
	

	public int extension_csv(){

		extension_csv = 1;
		extension_ical = 0;
		
		return extension_csv;
	}
	
	public int getExtCsv(){
		return extension_csv;
	}
	public int getExtIcal(){
		return extension_ical;
	}


	public void setExtension_ical(int extension_ical) {
		this.extension_ical = extension_ical;
	}


	public void setExtension_csv(int extension_csv) {
		this.extension_csv = extension_csv;
	}

}
