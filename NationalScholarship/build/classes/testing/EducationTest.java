package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Education;
import service.EducationService;
import service.EducationServiceImplementation;

public class EducationTest {
	EducationService eduSer=new EducationServiceImplementation();
	@Test
	public void createTest(){
		Education edu=new Education();
		Assertions.assertTrue(edu!=null);
		edu.setAadharNumber("765865887998");
		edu.setNinthPercentage(89);
		edu.setNinthYear(2022);
		edu.setAdmissionFee(7500);
		edu.setTuitionFee(25000);
		
		eduSer.createEducationService(edu);
	}

	@Test
	public void selectTest() {
		Education edu=eduSer.findEducationService("765865887998");
		System.out.println(edu);
	}
	
	@Test
	public void selectsTest() {
		List <Education> eduList=eduSer.findEducationService();
		for(Education edu:eduList) {
			System.out.println(edu);
		}
	}
}
