package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Institute;

public class InstituteDAOImplementation extends BaseDAO implements InstituteDAO{
	
	public InstituteDAOImplementation() {
		super();
	}

	@Override
	public void insertInstitute(Institute institute) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO INSTITUTE VALUES (?,?,?,?,?,?)");
			
			
			pst.setString(1, institute.getInstituteCode());
			pst.setString(2, institute.getInstituteName());
			pst.setString(3, institute.getPrincipleName());
			pst.setString(4, institute.getLocation());
			pst.setString(5, institute.getInstitutePassword());
			pst.setBoolean(6, institute.isVerified());

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Institute selectInstitute(String instituteCode) {
		// TODO Auto-generated method stub
		Institute institute =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement 
			ResultSet result = statement.executeQuery("SELECT * FROM INSTITUTE WHERE INSTITUTE_CODE="+instituteCode);
			
			//5. process the result if any
			if(result.next()) {
				institute = new Institute(); //blank object
				
				institute.setInstituteCode(result.getString(1));
				institute.setInstituteName(result.getString(2));
				institute.setPrincipleName(result.getString(3));
				institute.setLocation(result.getString(4));
				institute.setInstitutePassword(result.getString(5));
				String s=(result.getString(6));
				if(s=="true")
					institute.setVerified(true);
				else
					institute.setVerified(false);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return institute;
	}

	@Override
	public List<Institute> selectInstitutes() {
		// TODO Auto-generated method stub
		List<Institute> instituteList = new ArrayList<Institute>();
		try {
			
			 
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM INSTITUTE");
			
			//5. process the result if any
			while(result.next()) {
				Institute institute = new Institute(); //blank object
				
				institute.setInstituteCode(result.getString(1));
				institute.setInstituteName(result.getString(2));
				institute.setPrincipleName(result.getString(3));
				institute.setLocation(result.getString(4));
				institute.setInstitutePassword(result.getString(5));
				String b=result.getString(6);
				if(b=="true")
					institute.setVerified(true);
				else
					institute.setVerified(false);
				instituteList.add(institute); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instituteList;
	}

	@Override
	public void updateInstitute(Institute institute) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE INSTITUTE set IS_VERIFIED=? where institute_code=?");

			pst.setBoolean(1,institute.isVerified());
			pst.setString(2, institute.getInstituteCode());
			
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
