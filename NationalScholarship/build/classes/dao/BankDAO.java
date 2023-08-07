package dao;

import java.util.List;

import entities.Bank;

public interface BankDAO {
	void createBank(Bank bank);
	Bank selectBank(String accountNumber);
	List<Bank> selectBanks();
	void updateBank(Bank bank);
}
