package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Scholarship;
import service.ScholarshipService;
import service.ScholarshipServiceImplementation;

public class ScholarshipTest {
	ScholarshipService schSer=new ScholarshipServiceImplementation();
	@Test
	public void createTest() {
		
		Scholarship sch = new Scholarship();
		System.out.println("bank created....");
		Assertions.assertTrue(sch!=null);
		sch.setAadharNumber("765865887998");
		sch.setNTSE("Applied");
		sch.setAlreadyNTSE(1);
		schSer.createScholarshipService(sch);
	}
	
	@Test
	public void selectTest() {
		Scholarship sch=schSer.findScholarshipService("765865887998");
		System.out.println(sch);
	}
	
	@Test
	public void selectsTest() {
		List <Scholarship> schList=schSer.findScholarshipsService();
		for(Scholarship sch:schList) {
		System.out.println(sch);
	}
	
	}

}
