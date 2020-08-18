
public class Instructor {

	private String name;
	private String cca;
	private int size;
	private String day;
	private String time;
	private String venue;

	public Instructor(String name, String cca, int size, String day, String time, String venue) {
		this.name = name;
		this.cca = cca;
		this.size = size;
		this.day = day;
		this.time = time;
		this.venue = venue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCca() {
		return cca;
	}

	public void setCca(String cca) {
		this.cca = cca;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
}
