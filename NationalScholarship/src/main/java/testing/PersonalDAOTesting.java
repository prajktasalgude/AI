package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.PersonalDAO;
import dao.PersonalDAOImplementation;
import entities.Personal;

public class PersonalDAOTesting {
	PersonalDAO eduDAO = new PersonalDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(eduDAO!=null);
		System.out.println("Got the DAO : "+eduDAO);

		Personal eduObj = eduDAO.selectPersonal("456289762312");
		
		System.out.println("Edu Obj : "+eduObj);

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

		
		eduDAO.insertPersonal(eduObj);
	}
	
}
