package service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.Institute;
import entities.Students;
import dao.StudentsDAO;
import dao.StudentsDAOImplementation;

public class StudentServiceImplementation implements StudentService{

	StudentsDAO studDAO=new StudentsDAOImplementation();
	@Override
	//when student click on registration 
	public void createStudentService(Students stud) {
			studDAO.insertStudent(stud);
		
	}
		

	@Override
	//when student want to check own registration information
	public Students findStudentService(String aadharNumber) {
		// TODO Auto-generated method stub
		Students stud=studDAO.selectStudent(aadharNumber);
		return stud;
	}

	@Override
	//for SNO
	public List<Students> findStudentsService() {
		// TODO Auto-generated method stub
		List <Students> studList=studDAO.selectStudents();
		return studList;
	}

	@Override
	public List<Students> findStudentsService(Institute institute) {
		// TODO Auto-generated method stub
		List <Students> studList=studDAO.selectStudents(institute);
		return studList;
	}

	@Override
	public void modifyStudentService(Students stud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudentService(String aadharNumber) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String ar[]) {
		StudentService studSer=new StudentServiceImplementation();
		Students stud=new Students();
		
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
		
		studSer.createStudentService(stud);
		
		Students student=studSer.findStudentService(stud.getAadharNumber());
		System.out.println(student);
		
		List <Students> studList=studSer.findStudentsService();
		for(Students st:studList) {
			System.out.println(st);
		}
		
		Institute institute=new Institute();
		institute.setInstituteCode("13844");
		studList=studSer.findStudentsService(institute);
		for(Students st:studList) {
			System.out.println(st);
		}
	}
}
