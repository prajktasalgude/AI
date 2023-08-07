package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.SNO;
import service.SNOService;
import service.SNOServiceImplementation;

public class SNOTest {

	SNOService snoSer=new SNOServiceImplementation();
	@Test
	public void createTest(){
		SNO sno=new SNO();
		Assertions.assertTrue(sno!=null);
		sno.setUsername("mpsno");
		sno.setPassword("Mp@123");
		snoSer.createSNOService(sno);
	}

	@Test
	public void selectTest() {
		SNO sno=snoSer.findSNOService("mpsno");
		System.out.println(sno);
	}
	
	@Test
	public void selectsTest() {
		List <SNO> snoList=snoSer.findSNOsService();
		for(SNO sno:snoList) {
			System.out.println(sno);
		}
	}
}
