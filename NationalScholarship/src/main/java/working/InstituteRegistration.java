package working;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Institute;
import service.InstituteService;
import service.InstituteServiceImplementation;

public class InstituteRegistration {

	InstituteService instSer=new InstituteServiceImplementation();
	@Test
	public void createTest() {
		Institute institute = new Institute();
		Assertions.assertTrue(institute!=null);
		System.out.println("institute created....");
		institute.setInstituteCode("77463");
		institute.setInstituteName("Orchid College, Solapur");
		institute.setPrincipleName("p. S. Kharat");
		institute.setLocation("Urban");
		institute.setInstitutePassword("Orchid@123");
		institute.setVerified(false);
		instSer.createInstituteService(institute);
	}
		
		@Test
		public void selectTest() {
			Institute institute=instSer.findInstituteService("77463");
			System.out.println(institute);
		}
}
