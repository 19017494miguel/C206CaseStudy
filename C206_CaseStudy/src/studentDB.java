
public class studentDB extends Student{

	public studentDB(String id, String name, String grade, String classes, String teacher) {
		super(id, name, grade, classes, teacher);
		}
	
	public void addStudent() {
		super.getname();
		super.getid();
		super.getclasses();
		super.getteacher();
		super.getgrade();
	}
	
	public void viewAllStudents() {
		super.getname();
		super.getid();
		super.getclasses();
	}
	
	public void delStudent(String name) {
		super.getname();
		super.getid();
		super.getclasses();
		super.getteacher();
		super.getgrade();
		
	}
	
	public void showStudentMenu() {
		System.out.print("Name: " + getname());
		System.out.print("Class: " + getclasses());
		System.out.print("Student ID: " + getid());
		System.out.print("Grade: " + getgrade());
		System.out.print("Teacher: " + getteacher());
	}
	

} // end of class
