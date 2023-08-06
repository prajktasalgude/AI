package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.SNO;

public class SNODAOImplementation extends BaseDAO implements SNODAO{
	public SNODAOImplementation() {
		super();
	}
	
	public void insertSNO(SNO sno) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO SNO VALUES (?,?)");
			
			
			pst.setString(1, sno.getUsername());
			pst.setString(2, sno.getPassword());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SNO selectSNO(String username) {
		SNO sno =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			
			//String username = "rjsno";
			String query = "SELECT * FROM SNO WHERE SNO_USERNAME = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			
			ResultSet result = pstmt.executeQuery();
			
			//4. execute that statement 
			//ResultSet result = statement.executeQuery("SELECT * FROM SNO WHERE SNO_USERNAME= ?");
			
			//5. process the result if any
			if(result.next()) {
				sno = new SNO(); //blank object
				
				sno.setUsername(result.getString(1));
				sno.setPassword(result.getString(2));
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sno;
	}
	
	public List<SNO> selectSNOs() {
		// TODO Auto-generated method stub
		List<SNO> snoList = new ArrayList<SNO>();
		try {
			
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM SNO");
			
			//5. process the result if any
			while(result.next()) {
				SNO sno = new SNO(); //blank object
				
				sno.setUsername(result.getString(1));
				sno.setPassword(result.getString(2));
				
				snoList.add(sno); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snoList;
	}

	public void updateSNO(SNO sno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE SNO set password=? where SNO_USERNAME="+sno.getUsername());
			
			
			pst.setString(1, sno.getUsername());
			pst.setString(2, sno.getPassword());
			
			
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