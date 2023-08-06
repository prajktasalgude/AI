package testing;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.StudentsDAO;
import dao.StudentsDAOImplementation;
import entities.Students;

public class StudentsDAOTesting {


	StudentsDAO studDAO = new StudentsDAOImplementation();
	
	@Test
	public void createStudentTest() {
		
		Students stud = new Students();
		Assertions.assertTrue(stud!=null);
		System.out.println("stud created....");
		
		stud.setAadharNumber("547658787998");
		stud.setStudentName("Shriya Pande");
		
		int year = 2007;
		int month = 7; // Note: Months are 0-based in Calendar, so 7 represents August
		int day = 5;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		Date date = calendar.getTime();
		stud.setDOB( date);
		
		stud.setGender("Female");
		stud.setInstituteCode("34675");
		stud.setAccountNumber("34675465858");
		
		stud.setPassword("Shriya@123");
		
		studDAO.insertStudent(stud);
		
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(studDAO!=null);
		System.out.println("Got the DAO : "+studDAO);

		List<Students> studObj = studDAO.selectStudents();
		for (Students stud: studObj) 
			System.out.println("Student Obj : "+stud);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(studDAO!=null);
		System.out.println("Got the DAO : "+studDAO);

		Students studObj = studDAO.selectStudent("345875986938");
		
		System.out.println("Student Obj : "+studObj);

		System.out.println("Test over...");
	}
	
}
