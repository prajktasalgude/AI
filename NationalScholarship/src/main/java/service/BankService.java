package service;

import java.util.List;

import entities.Bank;

public interface BankService {
	void createBankService(Bank bank);
	Bank findBankService(String accountNumber);
	List<Bank> findBanksService();
	void modifyBankService(Bank bank);
	void removeBankService(String accountNumber);
}
