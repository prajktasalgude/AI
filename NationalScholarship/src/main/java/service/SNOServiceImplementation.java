package service;

import java.util.List;

import entities.SNO;
import dao.SNODAO;
import dao.SNODAOImplementation;

public class SNOServiceImplementation implements SNOService{

	SNODAO snoDAO=new SNODAOImplementation();
	@Override
	public void createSNOService(SNO sno) {
		// TODO Auto-generated method stub
		snoDAO.insertSNO(sno);
		
	}

	@Override
	public SNO findSNOService(String username) {
		// TODO Auto-generated method stub
		SNO sno=snoDAO.selectSNO(username);
		return sno;
	}

	@Override
	public List<SNO> findSNOsService() {
		// TODO Auto-generated method stub
		List <SNO> snoList=snoDAO.selectSNOs();
		return snoList;
	}

	@Override
	public void modifySNOService(SNO sno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSNOService(String aadhartNumber) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String ar[]) {
		SNOService snoSer=new SNOServiceImplementation();
		SNO sno=new SNO();
		sno.setUsername("kasno");
		sno.setPassword("ka@123");
		snoSer.createSNOService(sno);
		
		SNO sn=snoSer.findSNOService(sno.getUsername());
		System.out.println(sn);
		
		List <SNO> snoList=snoSer.findSNOsService();
		for(SNO snos:snoList) {
			System.out.println(snos);
		}
	}

}
