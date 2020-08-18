import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class instructorTest {
	
	private Instructor instr1;
	private Instructor instr2;
	

	@Before
	public void setUp() throws Exception {
		instr1 = new Instructor("Syed");
		instr2 = new Instructor("Tan");
	}

	@After
	public void tearDown() throws Exception {
		instr1 = null;
		instr2 = null;
		InstructorDB.instructorList.clear();
		
	}

	@Test
	public void addInstructorTest() {
		//Test that the instructor arrayList is not null.
		assertNotNull("Test that the instructor arrayList is not null. ", InstructorDB.instructorList);
		
		//Test that the size of the instructor list is 0  before adding any instructor
		assertEquals("Test that the size of the instructor list is 0  before adding any instructor", 0, InstructorDB.instructorList.size());
		
		//Test that the size of the instructor list is 1 after adding 1 instructor
		InstructorDB.addInstructor(instr1);
		assertEquals("Test that the size of the instructor list is 1 after adding 1 instructor.", 1, InstructorDB.instructorList.size());
	}
	
	public void viewInstructorTest() {
		//Test if instructor list is not null but empty
		assertNotNull("Test if instructor list is not null but empty", InstructorDB.instructorList);
		
		//Test if instructor list is empty
		assertEquals("Test if instructor list is empty", 0, InstructorDB.instructorList.size());
		
		//Test if size of list is 1 after adding 1 item
		InstructorDB.addInstructor(instr1);
		assertEquals("Test if size of list is 1 after adding 1 item", 1, InstructorDB.instructorList.size());
	}
	
	public void delInstructorTest() {
		
	}

}
