package ourMethod;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import start_window.IcalWindow;

public class GenerateButton extends JApplet implements ActionListener {

	IcalWindow main = new IcalWindow();
	TimeZone timezone = new TimeZone(main);
	String filename;

	public void FGenerateButton(ArrayList<New> listOfEvents, String fileExtension) throws FileNotFoundException {

		JApplet FileSaved = this;

		FileSaved.setSize(325, 200);
		FileSaved.getContentPane().setBackground(Color.WHITE);
		FileSaved.setLayout(null);
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		DateFormat timeFormat = new SimpleDateFormat("HHmmss");

		Date date = new Date();

		if (fileExtension == "CSV") {
			filename = "GeneratedFileIcal.csv";
			System.out.println(filename);
		}

		else if (fileExtension == "Ical") {
			filename = "GeneratedFileIcal.ical";
			System.out.println(filename);

			PrintWriter saveFile = new PrintWriter(filename);

			int i = 0;

			saveFile.println("BEGIN:VCALENDAR\n");
			saveFile.println("PRODID:-//www.whashouldbehere.pl//iCal Calendar Generator\n");
			saveFile.println("VERSION:2.0\n");
			saveFile.println("CALSCALE:GREGORIAN\n");
			saveFile.println("METHOD:PUBLISH");
			saveFile.println("X-WR-CALNAME:" + listOfEvents.get(i).getTitle() + "\n");
			saveFile.println("X-WR-TIMEZONE:Europe/Warsaw");

			while (i < listOfEvents.size()) {

				saveFile.println("BEGIN:VEVENT\n");
				saveFile.println("DTSTART:" + listOfEvents.get(i).getDateStart() + "\n");
				saveFile.println("DTEND:" + listOfEvents.get(i).getDateEnd() + "\n");
				saveFile.println("DTSTAMP:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("UID: 20160302T174116Z-1637387249@adres.com \n");
				saveFile.println("CREATED:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("DESCRIPTION:");
				saveFile.println("LAST-MODIFIED:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("LOCATION:");
				saveFile.println("SEQUENCE:1");
				saveFile.println("STATUS:CONFIRMED");
				saveFile.println("SUMMARY:" + listOfEvents.get(i).getTitle());
				saveFile.println("TRANSP:OPAQUE");
				saveFile.println("END:VEVENT\n");

				i++;
			}

			saveFile.println("END:VCALENDAR\n");

			saveFile.close();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
