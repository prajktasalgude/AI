package working;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Bank;
import entities.Students;
import service.BankService;
import service.BankServiceImplementation;
import service.StudentService;
import service.StudentServiceImplementation;

public class StudentRegistration {
	
	BankService bankSer=new BankServiceImplementation();
	StudentService studSer=new StudentServiceImplementation();
	
	@Test
	public void createTest() {
	
		Bank bank = new Bank();
		System.out.println("bank created....");
		Assertions.assertTrue(bank!=null);
		bank.setAccountNumber("367574653464");
		bank.setHolderName("Ram Patil");
		bank.setIfsc("SBIN0005778967");
		bank.setBankName("SBI");
		bank.setBalance(6465);
		bankSer.createBankService(bank);
	
		Students stud=new Students();
		Assertions.assertTrue(stud!=null);
		stud.setAadharNumber("765865887998");
		stud.setStudentName("Ram Patil");
		int year = 2007;
		int month = 9; 
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
		
		Bank bank=bankSer.findBankService("367574653464");
		System.out.println(bank);
	}
	

}
