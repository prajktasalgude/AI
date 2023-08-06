package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.EducationDAO;
import dao.EducationDAOImplementation;
import entities.Education;

public class PersonalDAOTesting {
EducationDAO eduDAO = new EducationDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(eduDAO!=null);
		System.out.println("Got the DAO : "+eduDAO);

		Education eduObj = eduDAO.selectEducation("456289762312");
		
		System.out.println("Edu Obj : "+eduObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void createEducationTest() {
		
		Education eduObj = new Education();
		Assertions.assertTrue(eduObj!=null);
		System.out.println("edu created....");
		eduObj.setAadharNumber("456289762312");
		eduObj.setTenthPercentage(88.00f);
		eduObj.setTwelthPercentage(82.20f);
		eduObj.setNinthPercentage(87.17f);		
		eduObj.setAdmissionFee(500);
		eduObj.setTuitionFee(14325);		
		eduObj.setTenthYear(2017);
		eduObj.setTwelthYear(2019);
		eduObj.setNinthYear(2016);
		
		eduDAO.createEducation(eduObj);
	}
	
}
