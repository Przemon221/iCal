package testy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ourMethod.CsvWriter;

public class CsvWriterTest {

	CsvWriter writer;
	String subject;
	String startDate;
	String startTime;
	String endDate;
	String endTime;
	boolean allDayEvent;
	String description;
	String location;
	boolean isPrivate;
	
	
	@Before
	public void setUp() throws Exception {
		subject = "subject";
		startDate = "startDate";
		startTime = "startTime";
		endDate = "endDate";
		endTime = "endTime";
		allDayEvent = true;
		description = "d";
		location = "lo";
		isPrivate = true;
		writer = new CsvWriter(subject, startDate, startTime, endDate, endTime, allDayEvent, description, location, isPrivate);
	}

	@Test
	public final void testNotNull() {
		assertNotNull(writer);
	}
	
	@Test
	public final void testGetterSub() {
		assertEquals(subject, writer.getSubject());
	}
	
	@Test
	public final void testGetterStart() {
		assertEquals(startDate, writer.getStartDate());
	}
	
	@Test
	public final void testGetterTime() {
		assertEquals(startTime, writer.getStartTime());
	}
	
	@Test
	public final void testGetterDate() {
		assertEquals(endDate, writer.getEndDate());
	}
	
	@Test
	public final void testGetters(){
		assertEquals(allDayEvent, writer.getAllDayEvent());
		assertEquals(description, writer.getDescription());
		assertEquals(location, writer.getLocation());
		assertEquals(isPrivate, writer.getIsPrivate());
	}
}
