import java.util.ArrayList;
public class ParentDB {
	
	public static ArrayList<Parent>parentlist=new ArrayList<>();
	
	public static void addParent(Parent parent) {
		parentlist.add(parent);
	}
	public static void delParent(String name) {
		for(int i=0; i<parentlist.size();i++) {
			if(parentlist.get(i).getname().equalsIgnoreCase(name)) {
				parentlist.remove(i);
				break;
				
			}
		}
		
	}
	public static void showParentMenu() {
		System.out.println("Name: "+ getname());
		System.out.println("Email address: "+ getEmail_address());
		System.out.println("Contact Number: "+getContact_Number());
	}
	private static String getContact_Number() {
		// TODO Auto-generated method stub
		return null;
	}
	private static String getEmail_address() {
		// TODO Auto-generated method stub
		return null;
	}
	private static String getname() {
		// TODO Auto-generated method stub
		return null;
	}

}
