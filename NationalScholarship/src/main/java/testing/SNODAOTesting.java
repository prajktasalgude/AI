package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.SNODAO;
import dao.SNODAOImplementation;
import entities.SNO;
import entities.Students;

public class SNODAOTesting {


	SNODAO snoDAO = new SNODAOImplementation();
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(snoDAO!=null);
		System.out.println("Got the DAO : "+snoDAO);
		
		SNO snoObj = snoDAO.selectSNO("rjsno");
		
		System.out.println("SNO Obj : "+snoObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(snoDAO!=null);
		System.out.println("Got the DAO : "+snoDAO);

		List<SNO> snoObj = snoDAO.selectSNOs();
		for (SNO sno: snoObj) 
			System.out.println("Student Obj : "+sno);

		System.out.println("Test over...");
	}

}