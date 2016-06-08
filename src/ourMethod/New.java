package ourMethod;


public class New {

public String title;
public String dateStart;
public String dateEnd;
public String description;

/*public Event(String dateStart1, String dateEnd1, String title1, String description1) {
	title = title1;
	dateStart = dateStart1;
	dateEnd = dateEnd1;
	description = description1;
}
*/

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
