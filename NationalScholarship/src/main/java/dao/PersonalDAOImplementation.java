package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import entities.Personal;

public class PersonalDAOImplementation extends BaseDAO implements PersonalDAO{
	
	public PersonalDAOImplementation() {
		super();
	}

	@Override
	public void insertPersonal(Personal per) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO PERSONAL_DETAILS VALUES (?,?,?,?,?,?,?)");
			
			
			pst.setString(1, per.getAadharNumber());
			pst.setString(2, per.getFatherName());
			pst.setString(3, per.getMotherName());
			pst.setBoolean(4, per.isMaritalStatus());
			pst.setInt(5, per.getAnnualIncome());
			pst.setString(6, per.getCaste());
			pst.setBoolean(7, per.isDisable());

			
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
	public Personal selectPersonal(String aadharNumber) {
		// TODO Auto-generated method stub
		Personal per=null;
try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement 
			ResultSet result = statement.executeQuery("SELECT * FROM PERSONAL_DETAILS WHERE AADHAR_NUMBER="+aadharNumber);
			
			//5. process teh result if any
			if(result.next()) {
				per = new Personal(); //blank object
				
				per.setAadharNumber(result.getString(1));
				per.setFatherName(result.getString(2));
				per.setMotherName(result.getString(3));
				per.setMaritalStatus(result.getBoolean(4));
				per.setAnnualIncome(result.getInt(5));
				per.setCaste(result.getString(6));
				per.setDisable(result.getBoolean(7));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return per;
	}

	@Override
	public List<Personal> selectPersonals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePersonal(Personal per) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE PERSONAL_DETAILS set father_name=?,mother_name=?,marital_status=?,annual_income=?,account_number=?,is_disable=? where aadhar_number=?");
			
		pst.setString(7, per.getAadharNumber());
		pst.setString(1, per.getFatherName());
		pst.setString(2, per.getMotherName());
		pst.setBoolean(3, per.isMaritalStatus());
		pst.setInt(4, per.getAnnualIncome());
		pst.setString(5, per.getCaste());
		pst.setBoolean(6, per.isDisable());
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
