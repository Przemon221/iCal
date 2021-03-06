package ourMethod;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JApplet;

import start_window.IcalWindow;

public class GenerateButton extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;

	IcalWindow main = new IcalWindow();
	TimeZone timezone = new TimeZone(main);
	String filename;
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "Subject,Start Date,Start Time,End Date,End Time,All Day Event,"
			+ "Description,Location,Private";

	public void FGenerateButton(ArrayList<New> listOfEvents, String fileExtension) throws FileNotFoundException {

		JApplet FileSaved = this;

		FileSaved.setSize(325, 200);
		FileSaved.getContentPane().setBackground(Color.WHITE);
		FileSaved.setLayout(null);
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		DateFormat timeFormat = new SimpleDateFormat("HHmmss");
		DateFormat timeFormatCsv = new SimpleDateFormat("HH:mm");

		Date date = new Date();

		if (fileExtension == "CSV") {

			filename = "GeneratedFileIcal.csv";
			System.out.println(filename);

			int i = listOfEvents.size();
			CsvWriter Events[] = new CsvWriter[i];

			ArrayList<CsvWriter> CsvWriterEvent = new ArrayList<CsvWriter>();

			for (int j = 0; j < listOfEvents.size(); j++) {
				Events[j] = new CsvWriter(listOfEvents.get(j).getTitle(), listOfEvents.get(j).getDateStart(),
						timeFormatCsv.format(date) + " AM", listOfEvents.get(j).getDateEnd(),
						timeFormatCsv.format(date) + " PM", false, "", "", false);

				CsvWriterEvent.add(Events[j]);

			}

			FileWriter fileWriter = null;
			try {

				fileWriter = new FileWriter(filename);

				fileWriter.append(FILE_HEADER.toString());
				fileWriter.append(NEW_LINE_SEPARATOR);

				for (CsvWriter csvwriter : CsvWriterEvent) {

					fileWriter.append(String.valueOf(csvwriter.getSubject()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getStartDate()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getStartTime()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getEndDate()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getEndTime()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getAllDayEvent()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getDescription()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getLocation()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(csvwriter.getIsPrivate()));
					fileWriter.append(NEW_LINE_SEPARATOR);

				}

				System.out.println("CSV file was created successfully");

			} catch (Exception e) {
				System.out.println("Error in CsvFileWriter !!!");
				e.printStackTrace();
			} finally {

				try {
					fileWriter.flush();
					fileWriter.close();

				} catch (IOException e) {
					System.out.println("Error while flushing/closing fileWriter !!!");
					e.printStackTrace();

				}

			}
		}

		else if (fileExtension == "Ical") {
			filename = "GeneratedFileIcal.ical";
			System.out.println(filename);

			PrintWriter saveFile = new PrintWriter(filename);

			int i = 0;

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.HOUR, +1);
			Date oneHourMore = cal.getTime();

			saveFile.println("BEGIN:VCALENDAR\n");
			saveFile.println("PRODID:-//www.whashouldbehere.pl//iCal Calendar Generator\n");
			saveFile.println("VERSION:2.0\n");
			saveFile.println("CALSCALE:GREGORIAN\n");
			saveFile.println("METHOD:PUBLISH");
			saveFile.println("X-WR-CALNAME:mail@google.pl \n");
			saveFile.println("X-WR-TIMEZONE:Europe/Warsaw");

			while (i < listOfEvents.size()) {

				saveFile.println("BEGIN:VEVENT\n");
				saveFile.println(
						"DTSTART:" + listOfEvents.get(i).getDateStart() + "T" + timeFormat.format(date) + "Z\n");
				saveFile.println("DTEND:" + listOfEvents.get(i).getDateEnd() + "T" + timeFormat.format(oneHourMore) + "Z\n");
				saveFile.println("DTSTAMP:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("UID:fov"+i+"vt1421405noh3pges9jjtc@google.com \n");
				saveFile.println("CREATED:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("DESCRIPTION:");
				saveFile.println("LAST-MODIFIED:" + dateFormat.format(date) + "T" + timeFormat.format(date) + "Z");
				saveFile.println("LOCATION:");
				saveFile.println("SEQUENCE:0");
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
