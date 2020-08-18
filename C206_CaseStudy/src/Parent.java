
public class Parent {

	private String name;
	private String Email_address;
	private String Address;
	private int Contact_Number;
	
	
	
	public Parent (String name, String Email_address, String Address, int Contact_Number) {
		this.name = name;
		this.Email_address = Email_address;
		this.Address=Address;
		this.Contact_Number = Contact_Number;	

	}
	public String getname() {
		return name;
		
	}
	public String getEmail_address() {
		return Email_address;
	
		
	}
	public String Address() {
		return Address;
	}
	public int getContact_Number() {
		return Contact_Number;
		
	}
	
	
}


// end of class