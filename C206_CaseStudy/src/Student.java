
public class Student {
	
	private String id;
	private String name;
	private String grade;
	private String classes;
	private String teacher;
	
	public Student (String id, String name, String grade, String classes, String teacher) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.classes = classes;
		this.teacher = teacher;
	}
	
	public String getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public String getgrade() {
		return grade;
	}
	
	public String getclasses() {
		return classes;
	}
	
	public String getteacher() {
		return teacher;
	}

}// end of class 
