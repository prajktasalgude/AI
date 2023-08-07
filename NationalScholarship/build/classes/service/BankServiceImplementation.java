package service;

import java.util.List;

import entities.Bank;
import dao.BankDAOImplementation;
import dao.BankDAO;

public class BankServiceImplementation implements BankService{
	BankDAO bankDAO=new BankDAOImplementation();
	@Override
	public void createBankService(Bank bank) {
		// TODO Auto-generated method stub
		bankDAO.createBank(bank);
	}

	@Override
	public Bank findBankService(String accountNumber) {
		// TODO Auto-generated method stub
		Bank bank=bankDAO.selectBank(accountNumber);
		return bank;
	}

	@Override
	public List<Bank> findBanksService() {
		// TODO Auto-generated method stub
		List <Bank> bankList=bankDAO.selectBanks();
		return bankList;
	}

	@Override
	public void modifyBankService(Bank bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBankService(String accountNumber) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		BankService bankSer=new BankServiceImplementation();
		Bank bank = new Bank();
		System.out.println("bank created....");
		
		bank.setAccountNumber("34675465858");
		bank.setHolderName("Shriya Pande");
		bank.setIfsc("SBINO000675867");
		bank.setBankName("SBI");
		bank.setBalance(6578);
		//bankSer.createBankService(bank);
		
//		Bank b=bankSer.findBankService(bank.getAccountNumber());
//		System.out.println(b);
		
		List <Bank> bankList=bankSer.findBanksService();
		for(Bank b1:bankList) {
			System.out.println(b1);
		}
	}

}
