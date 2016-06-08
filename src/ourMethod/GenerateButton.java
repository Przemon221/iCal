package ourMethod;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import start_window.IcalWindow;


public class GenerateButton extends JApplet implements ActionListener{

	IcalWindow main = new IcalWindow();
	TimeZone timezone = new TimeZone(main);
	
	
	
	public void FGenerateButton(ArrayList<New> listOfEvents ) throws FileNotFoundException{
		
		
		JApplet FileSaved = this;
		
		FileSaved.setSize(325,200);
		FileSaved.getContentPane().setBackground(Color.WHITE);
		FileSaved.setLayout(null);
		
		//if (zmiennaOpcji == ".CSV"){
			PrintWriter saveFile = new PrintWriter("GeneratedFileIcal.csv");
		//}
		
		//else if (zmiennaOpcji == ".iCal"){
			//PrintWriter saveFile = new PrintWriter("C:\\file.ical");
		//}
			
			int i=0;
			
			while(i<listOfEvents.size()){
			
				
				saveFile.println("BEGIN: VCALENDAR\n");
				saveFile.println("VERSION: 1.0\n");
				saveFile.println("PRODID: -//www.whashouldbehere.pl//iCal Calendar Generator\n");
				saveFile.println("X-WR- CALNAME: "+listOfEvents.get(i).getTitle()+"\n");
				saveFile.println("CALSCALE: GREGORIAN\n");
				saveFile.println("BEGIN: VTIMEZONE\n");
				
				//String value = timezone.cTimezone.get(3);
				
				//saveFile.println("TZID: "+value+"\n");
				//saveFile.println("TZURL: http://tzurl.org/zoneinfo-outlook/"+value+"\n"); 
				//saveFile.println("X-LIC- LOCATION :"+value+"\n");
				saveFile.println("BEGIN: DAYLIGHT\n");
				//saveFile.println("TZOFFSETFROM: "+value+"\n");
				saveFile.println("DTSTART :"+listOfEvents.get(i).getDateStart()+"\n"); 
				saveFile.println("RRULE: FREQ=YEARLY;BYMONTH=3;BYDAY=-1SU\n"); // ?
				saveFile.println("END: DAYLIGHT\n");
				saveFile.println("BEGIN: STANDARD \n");
				saveFile.println("TZOFFSETFROM: +0200 \n");
				saveFile.println("TZOFFSETTO: +0100 \n");
				saveFile.println("DTSTART :"+listOfEvents.get(i).getDateStart()+"\n"); 
				saveFile.println("RRULE: FREQ=YEARLY;BYMONTH=10;BYDAY=-1SU \n");
				saveFile.println("END: STANDARD \n");
				saveFile.println("END: VTIMEZONE \n");
				saveFile.println("BEGIN: VEVENT \n");
				saveFile.println("DTSTAMP: 20160302T174116Z \n");
				saveFile.println("UID: 20160302T174116Z-1637387249@adres.com \n");// ?
				//saveFile.println("DTSTART;TZID="+value+":20160302T120000 \n");
				//saveFile.println("DTEND;TZID="+value+":20160316T121500 \n");
				//saveFile.println("DESCRIPTION: "+tEvent.getText()+" \n");
				saveFile.println("BEGIN: VALARM \n");
				saveFile.println("ACTION: DISPLAY \n");
				saveFile.println("TRIGGER: -PT15M \n");
				saveFile.println("END: VALARM \n");
				saveFile.println("END: VEVENT \n");
				saveFile.println("END: VCALENDAR \n");
				
				System.out.println("\n\n");
				i++;
			}
	      
		saveFile.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

		
}
