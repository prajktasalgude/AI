package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Bank;
import service.BankService;
import service.BankServiceImplementation;

public class BankTest {

	BankService bankSer=new BankServiceImplementation();
	@Test
	public void createTest() {
		
		Bank bank = new Bank();
		System.out.println("bank created....");
		Assertions.assertTrue(bank!=null);
		bank.setAccountNumber("367574653464");
		bank.setHolderName("Ram Patil");
		bank.setIfsc("SBIN0005778967");
		bank.setBankName("SBI");
		bank.setBalance(6465);
		bankSer.createBankService(bank);
	}
	
	@Test
	public void selectTest() {
		Bank bank=bankSer.findBankService("367574653464");
		System.out.println(bank);
	}
	
	@Test
	public void selectsTest() {
		List <Bank> bankList=bankSer.findBanksService();
		for(Bank bank:bankList) {
		System.out.println(bank);
	}
	
	}

}
