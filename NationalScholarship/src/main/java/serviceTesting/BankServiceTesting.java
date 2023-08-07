package serviceTesting;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import service.BankService;
import service.BankServiceImplementation;
import entities.Bank;

public class BankServiceTesting {
	
	BankService bankSer=new BankServiceImplementation();
	@Test
	public void bankInsertTest() {
	Bank bank = new Bank();
	Assertions.assertTrue(bank!=null);
	System.out.println("Bank created....");
	
	bank.setAccountNumber("44547465858");
	bank.setHolderName("Shweta Pande");
	bank.setIfsc("SBINO0006576767");
	bank.setBankName("SBI");
	bank.setBalance(6657);
	bankSer.createBankService(bank);
	}
	
	@Test
	public void bankSelectTest() {
		Bank bank = new Bank();
		Assertions.assertTrue(bank!=null);
		System.out.println("Bank created....");
		Bank b=bankSer.findBankService("44547465858");
		System.out.println(b);
	}
	
	@Test
	public void bankSelectsTest() {
		Bank bank = new Bank();
		Assertions.assertTrue(bank!=null);
		System.out.println("Bank created....");
		List <Bank> bankList=bankSer.findBanksService();
		for(Bank b1:bankList) {
		System.out.println(b1);
	}
}
			
	@Test
	public void bankUpdateTest() {
		//Bank bank = new Bank();
		Bank bank =bankSer.findBankService("12341234");
		Assertions.assertTrue(bank!=null);
		System.out.println("Bank created....");
		bank.setBalance(bank.getBalance()+30000);
		bankSer.modifyBankService(bank);
		System.out.println(bank);
	}
			
}
