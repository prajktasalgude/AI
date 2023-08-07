package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.PersonalDAO;
import dao.PersonalDAOImplementation;
import entities.Personal;

public class PersonalDAOTesting {
	PersonalDAO perDAO = new PersonalDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(perDAO!=null);
		System.out.println("Got the DAO : "+perDAO);

		Personal perObj = perDAO.selectPersonal("456289762312");
		
		System.out.println("Edu Obj : "+perObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(perDAO!=null);
		System.out.println("Got the DAO : "+perDAO);

		List <Personal> perObj = perDAO.selectPersonals();
		for(Personal per:perObj)
			System.out.println("Per Obj : "+perObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void createEducationTest() {
		
		Personal eduObj = new Personal();
		Assertions.assertTrue(eduObj!=null);
		System.out.println("edu created....");
		eduObj.setAadharNumber("456289762312");
		eduObj.setFatherName("hfyg");
		eduObj.setMotherName("vggj");
		eduObj.setMaritalStatus(false);		
		eduObj.setAnnualIncome(500000);
		eduObj.setCaste("OPEN");		
		eduObj.setDisable(false);

		
		perDAO.insertPersonal(eduObj);
	}
	
}
