package dao;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Education;

public class EducationDAOImplementation extends BaseDAO implements EducationDAO {

	public EducationDAOImplementation() {
		super();
	}
	
	@Override
	public void createEducation(Education education) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO EDUCATIONAL_DETAILS VALUES (?,?,?, ?,?,?, ?,?,?)");
			
			pst.setString(1, education.getAadharNumber());
			pst.setFloat(2,education.getTenthPercentage());
			pst.setFloat(3,education.getTwelthPercentage());
			pst.setFloat(4,education.getNinthPercentage());
			pst.setInt(5, education.getAdmissionFee());
			pst.setInt(6,education.getTuitionFee());
			pst.setInt(7,education.getTenthYear());
			pst.setInt(8, education.getTwelthYear());
			pst.setInt(9, education.getNinthYear());
			
			
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
	public Education selectEducation(String aadharNumber) {
		// TODO Auto-generated method stub
		Education eduObj = null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM EDUCATIONAL_DETAILS WHERE AADHAR_NUMBER="+aadharNumber);
			
			//5. process teh result if any
			if(result.next()) {
				eduObj = new Education(); //blank object
				
				eduObj.setAadharNumber(result.getString(1));
				eduObj.setTenthPercentage(result.getFloat(2));
				eduObj.setTwelthPercentage(result.getFloat(3));
				eduObj.setNinthPercentage(result.getFloat(4));
				eduObj.setAdmissionFee(result.getInt(5));
				eduObj.setTuitionFee(result.getInt(6));
				eduObj.setTenthYear(result.getInt(7));
				eduObj.setTwelthYear(result.getInt(8));
				eduObj.setNinthYear(result.getInt(9));
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eduObj;
	}

	@Override
	public List<Education> selectEducations() {
		// TODO Auto-generated method stub
		List<Education> eduList = new ArrayList<Education>();

		//Education eduObj = null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM EDUCATIONAL_DETAILS");
			
			//5. process the result if any
			while(result.next()) {
				Education eduObj = new Education(); //blank object
				System.out.println("Hello");
				eduObj.setAadharNumber(result.getString(1));
				eduObj.setTenthPercentage(result.getFloat(2));
				eduObj.setTwelthPercentage(result.getFloat(3));
				eduObj.setNinthPercentage(result.getFloat(4));
				eduObj.setAdmissionFee(result.getInt(5));
				eduObj.setTuitionFee(result.getInt(6));
				eduObj.setTenthYear(result.getInt(7));
				eduObj.setTwelthYear(result.getInt(8));
				eduObj.setNinthYear(result.getInt(9));
				eduList.add(eduObj); //fill up the list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eduList;
	}

	@Override
	public void updateEducation(Education education) {
		// TODO Auto-generated method stub
		
	}
	
}