package ourMethod;

public class CsvWriter {

	private String subject;
	private String startDate;
	private String startTime;
	private String endDate;
	private String endTime;
	private boolean allDayEvent;
	private String description;
	private String location;
	private boolean isPrivate;

	public CsvWriter(String Subject, String StartDate, String StartTime, String EndDate, String EndTime,
			boolean AllDayEvent, String Description, String Location, boolean IsPrivate) {

		super();

		this.subject = Subject;
		this.startDate = StartDate;
		this.startTime = StartTime;
		this.endDate = EndDate;
		this.endTime = EndTime;
		this.allDayEvent = AllDayEvent;
		this.description = Description;
		this.location = Location;
		this.isPrivate = IsPrivate;

	}

	public String getSubject() {

		return subject;

	}

	public void setSubject(String subject) {

		this.subject = subject;

	}

	public String getStartDate() {

		return startDate;
	}

	public void setStartDate(String startDate) {

		this.startDate = startDate;

	}

	public String getStartTime() {

		return startTime;
	}

	public void setStartTime(String startTime) {

		this.startTime = startTime;

	}

	public String getEndDate() {

		return endDate;

	}

	public void setEndDate(String endTime) {

		this.endTime = endTime;

	}

	public String getEndTime() {

		return endTime;

	}

	public void setEndTime(String endTime) {

		this.endTime = endTime;

	}

	public boolean getAllDayEvent() {

		return allDayEvent;

	}

	public void setAllDayEvent(boolean allDayEvent) {

		this.allDayEvent = allDayEvent;

	}

	public String getDescription() {

		return description;

	}

	public void setDecscription(String description) {

		this.description = description;
	}

	public String getLocation() {

		return location;
	}

	public void setLocation(String location) {

		this.location = location;
	}

	public boolean getIsPrivate() {

		return isPrivate;
	}

	public void setIsPrivate(boolean isPrivate) {

		this.isPrivate = isPrivate;
	}

	@Override
	public String toString() {
		return "CsvWriter [subject=" + subject + ", startDate=" + startDate + ", startTime=" + startTime + ", endDate="
				+ endDate + ", endTime=" + endTime + ", allDayEvent=" + allDayEvent + ", description=" + description
				+ ", location=" + location + ", isPrivate=" + isPrivate + "]";
	}

}
