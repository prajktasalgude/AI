package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.BankDAO;
import dao.BankDAOImplementation;
import entities.Bank;

public class BankDAOTesting {


	BankDAO bankDAO = new BankDAOImplementation();

	@Test
	public void createStudentTest() {
		
		Bank bank = new Bank();
		Assertions.assertTrue(bank!=null);
		System.out.println("stud created....");
		
		bank.setAccountNumber("34675465858");
		bank.setHolderName("Shriya Pande");
		bank.setIfsc("SBINO000675867");
		bank.setBankName("SBI");
		bank.setBalance(6578);
		//institute.setVerified(false);
		
		bankDAO.createBank(bank);
		
	}
	
	@Test
	public void selectsTest() {
		System.out.println("Test started..");
		Assertions.assertTrue(bankDAO!=null);
		System.out.println("Got the DAO : "+bankDAO);

		List<Bank> bankObj = bankDAO.selectBanks();
		for (Bank bank: bankObj) 
			System.out.println("Institute Obj : "+bank);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(bankDAO!=null);
		System.out.println("Got the DAO : "+bankDAO);

		Bank bankObj = bankDAO.selectBank("65869070675");
		
		System.out.println("Institute Obj : "+bankObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void modifyBankTest() {
		
		Bank bank =bankDAO.selectBank("23167287256");
		Assertions.assertTrue(bank!=null);
		System.out.println("bank created....");
		bank.setBalance(bank.getBalance()+30000);
		//bank.setAccountNumber("23167287256");

		
		bankDAO.updateBank(bank);
		
	}
}