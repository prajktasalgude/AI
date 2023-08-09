package service;

import java.util.List;

import org.junit.Test;

import entities.Bank;
import entities.Scholarship;
import entities.Students;

public class Ministry {
	StudentService studSer=new StudentServiceImplementation();
	ScholarshipService schSer=new ScholarshipServiceImplementation();
	BankService bankSer =new BankServiceImplementation();
	
	@Test
	public void ministerPMSTest() {
		List<Scholarship> schList=schSer.findScholarshipsService();
		for(Scholarship sch:schList) {
			if(sch!=null) {
				if(sch.getPMS().equals("Verified")) {
					sch.setPMS("Granted");
					schSer.modifyScholarshipService(sch);
					System.out.println(sch);
					Students stud=studSer.findStudentService(sch.getAadharNumber());
					if(stud!=null) {
					
						Bank bank=bankSer.findBankService(stud.getAccountNumber());
						bank.setBalance(bank.getBalance()+25000);
						bankSer.modifyBankService(bank);
						System.out.println(bank);
					}
				}
				
			}
			
		}
	}
		
		@Test
		public void ministerNTSETest() {
			List<Scholarship> schList=schSer.findScholarshipsService();
			for(Scholarship sch:schList) {
				if(sch!=null) {
					if(sch.getNTSE().equals("Verified")) {
						sch.setNTSE("Granted");
						schSer.modifyScholarshipService(sch);
						System.out.println(sch);
						Students stud=studSer.findStudentService(sch.getAadharNumber());
						if(stud!=null) {
						
							Bank bank=bankSer.findBankService(stud.getAccountNumber());
							bank.setBalance(bank.getBalance()+30000);
							bankSer.modifyBankService(bank);
							System.out.println(bank);
						}
					}
					
				}
				
			}
	}
}
