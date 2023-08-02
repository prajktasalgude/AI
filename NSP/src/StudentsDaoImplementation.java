import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDaoImplementation implements StudentsDAO{
	
Connection conn ; //GLOBAL 
	
	public StudentsDaoImplementation() {
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertStudent(Students student) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			
			
			pst.setString(1, student.getStudentName());
			pst.setDate(2,(Date) student.getDOB());
			pst.setString(3, student.getGender());
			pst.setString(4, student.getStateOfDomicile());
			pst.setString(5, student.getDistrict());
			pst.setString(6, student.getInstituteCode());
			pst.setString(7, student.getAadharNumber());
			pst.setString(8, student.getEmail());
			pst.setString(9, student.getMobile());
			pst.setString(10, student.getBankIFSC());
			pst.setString(11, student.getBankAccountNumber());
			pst.setString(12, student.getBankName());
			pst.setString(13, student.getPassword());
			pst.setBoolean(14, student.isStatus());
			
		
			
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
	public Students selectStudent(String aadharNumber) {
		Students student =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM STUDENTS WHERE AADHAR=student.getAAdhar()");
			
			//5. process teh result if any
			if(result.next()) {
				student = new Students(); //blank object
				
				student.setStudentName(result.getString(1));
				student.setDOB(result.getDate(2));
				student.setGender(result.getString(3));
				student.setStateOfDomicile(result.getString(4));
				student.setDistrict(result.getString(5));
				student.setInstituteCode(result.getString(6));
				student.setAadharNumber(result.getString(7));
				student.setEmail(result.getString(8));
				student.setMobile(result.getString(9));
				student.setBankIFSC(result.getString(10));
				student.setBankAccountNumber(result.getString(11));
				student.setBankName(result.getString(12));
				student.setPassword(result.getString(13));
				student.setStatus(result.getBoolean(14));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Students> selectStudents() {
		// TODO Auto-generated method stub
		List<Students> studentList = new ArrayList<Students>();
		try {
			
			 
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM STUDENTS");
			
			//5. process the result if any
			while(result.next()) {
				Students student = new Students(); //blank object
				
				student.setStudentName(result.getString(1));
				student.setDOB(result.getDate(2));
				student.setGender(result.getString(3));
				student.setStateOfDomicile(result.getString(4));
				student.setDistrict(result.getString(5));
				student.setInstituteCode(result.getString(6));
				student.setAadharNumber(result.getString(7));
				student.setEmail(result.getString(8));
				student.setMobile(result.getString(9));
				student.setBankIFSC(result.getString(10));
				student.setBankAccountNumber(result.getString(11));
				student.setBankName(result.getString(12));
				student.setPassword(result.getString(13));
				student.setStatus(result.getBoolean(14));
				studentList.add(student); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public void updateStudent(Students student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE STUDENTS set dname=?, loc=? where deptno=?");
			
			
			pst.setString(1, student.getStudentName());
			pst.setDate(2,(Date) student.getDOB());
			pst.setString(3, student.getGender());
			pst.setString(4, student.getStateOfDomicile());
			pst.setString(5, student.getDistrict());
			pst.setString(6, student.getInstituteCode());
			pst.setString(7, student.getAadharNumber());
			pst.setString(8, student.getEmail());
			pst.setString(9, student.getMobile());
			pst.setString(10, student.getBankIFSC());
			pst.setString(11, student.getBankAccountNumber());
			pst.setString(12, student.getBankName());
			pst.setString(13, student.getPassword());
			pst.setBoolean(14, student.isStatus()); 

			
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
