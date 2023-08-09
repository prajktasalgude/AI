package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Personal;
import service.PersonalService;
import service.PersonalServiceImplementation;

public class PersonalTest {
	PersonalService perSer=new PersonalServiceImplementation();
	@Test
	public void createTest(){
		Personal per=new Personal();
		Assertions.assertTrue(per!=null);
		per.setAadharNumber("765865887998");
		per.setFatherName("Shan Patil");
		per.setMotherName("Sita Patil");
		per.setMaritalStatus(false);
		per.setAnnualIncome(250000);
		per.setCaste("OPEN");
		per.setDisable(false);
		perSer.createPersonalService(per);
	}

	@Test
	public void selectTest() {
		Personal per=perSer.findPersonalService("765865887998");
		System.out.println(per);
	}
	
	@Test
	public void selectsTest() {
		List <Personal> perList=perSer.findPersonalsService();
		for(Personal per:perList) {
			System.out.println(per);
		}
	}
}
