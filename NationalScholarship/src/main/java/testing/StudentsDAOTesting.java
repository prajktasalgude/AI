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
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(studDAO!=null);
		System.out.println("Got the DAO : "+studDAO);

		Students studObj = studDAO.selectStudent("345875986938");
		
		System.out.println("Student Obj : "+studObj);

		System.out.println("Test over...");
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
	public void createEmployeeTest() {
		
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
		stud.setDOB(date);
		
		stud.setGender("Female");
		stud.setInstituteCode("65476");
		stud.setAccountNumber("3546547688");
		
		stud.setPassword("Shriya@123");
		
		studDAO.insertStudent(stud);
		
	}
	
//	@Test
//	public void modifyEmployeeTest() {
//		
//		Employee emp = new Employee();
//		Assertions.assertTrue(emp!=null);
//		System.out.println("emp created....");
//		
//		emp.setEmployeeNumber(1111);
//		emp.setEmployeeName("Ratan");
//		emp.setEmailAddress("ratan@gmail.com");
//		
//		emp.setManagerCode(7566);
//		emp.setEmployeeJob("ANALYST");
//		emp.setHiredate(new Date());
//		
//		emp.setSalary(3100);
//		emp.setCommission(210);
//		emp.setDepartmentNumber(20); //INVALID 50 doesnot exist in DEPT table
//		
//		empDAO.updateEmployee(emp);
//		
//	}
}
