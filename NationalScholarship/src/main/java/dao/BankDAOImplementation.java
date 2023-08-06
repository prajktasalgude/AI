package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Bank;

public class BankDAOImplementation extends BaseDAO implements BankDAO{
	
	public BankDAOImplementation (){
		super();
	}

	@Override
	public void createBank(Bank bank) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO BANK_DETAILS VALUES (?,?,?,?,?)");
			
			pst.setString(1, bank.getAccountNumber());
			pst.setString(2,bank.getHolderName());
			pst.setString(3,bank.getIfsc());
			pst.setString(4,bank.getBankName());
			pst.setInt(5, bank.getBalance());
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Bank selectBank(String accountNumber) {
		// TODO Auto-generated method stub
		Bank bankObj = null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM BANK_DETAILS WHERE ACCOUNT_NUMBER="+accountNumber);
			
			//5. process teh result if any
			if(result.next()) {
				bankObj = new Bank(); //blank object
				bankObj.setAccountNumber(result.getString(1));
				bankObj.setHolderName(result.getString(2));
				bankObj.setIfsc(result.getString(3));
				bankObj.setBankName(result.getString(4));
				bankObj.setBalance(result.getInt(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bankObj;
	}

	@Override
	public List<Bank> selectBanks() {
		// TODO Auto-generated method stub
		List<Bank> bankList = new ArrayList<Bank>();

		Bank bankObj = null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM BANK_DETAILS");
			
			//5. process teh result if any
			while(result.next()) {
				bankObj = new Bank(); //blank object
				
				bankObj.setAccountNumber(result.getString(1));
				bankObj.setHolderName(result.getString(2));
				bankObj.setIfsc(result.getString(3));
				bankObj.setBankName(result.getString(4));
				bankObj.setBalance(result.getInt(5));
				
				bankList.add(bankObj); //fill up the list

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bankList;
	}

	@Override
	public void updateBank(Bank bank) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE BANK_DETAILS set bank_balance=? where account_number=?");
			
			
			pst.setInt(1, bank.getBalance());
			pst.setString(2, bank.getAccountNumber());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row MODIFIED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
