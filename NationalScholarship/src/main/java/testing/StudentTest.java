package testing;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Students;
import service.StudentService;
import service.StudentServiceImplementation;

public class StudentTest {
	StudentService studSer=new StudentServiceImplementation();
	@Test
	public void createTest(){
		Students stud=new Students();
		Assertions.assertTrue(stud!=null);
		stud.setAadharNumber("765865887998");
		stud.setStudentName("Ram Patil");
		int year = 2007;
		int month = 9; // Note: Months are 0-based in Calendar, so 7 represents August
		int day = 5;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		Date date = calendar.getTime();
		stud.setDOB( date);
		stud.setGender("Male");
		stud.setInstituteCode("77463");
		stud.setAccountNumber("367574653464");
		stud.setPassword("Ram@123");
		
		studSer.createStudentService(stud);
	}

	@Test
	public void selectTest() {
		Students student=studSer.findStudentService("765865887998");
		System.out.println(student);
	}
	
	@Test
	public void selectsTest() {
		List <Students> studList=studSer.findStudentsService();
		for(Students st:studList) {
			System.out.println(st);
		}
	}
}
