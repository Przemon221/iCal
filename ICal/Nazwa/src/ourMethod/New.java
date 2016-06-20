package ourMethod;

public class New {

	public String title;
	public String dateStart;
	public String dateEnd;

	public New(String dateStart, String dateEnd, String title) {
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getDateStart() {
		return dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

}
