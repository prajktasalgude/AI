package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Institute;
import entities.Students;

public class StudentsDAOImplementation extends BaseDAO implements StudentsDAO{
	public StudentsDAOImplementation() {
		super();
	}
	@Override
	public void insertStudent(Students student) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?)");
			
			pst.setString(1, student.getAadharNumber());
			pst.setString(2, student.getStudentName());
			java.sql.Date dob = new java.sql.Date(student.getDOB().getTime());
			pst.setDate(3,dob);
			pst.setString(4, student.getGender());
			pst.setString(5, student.getInstituteCode());
			pst.setString(6, student.getAccountNumber());
			pst.setString(7, student.getPassword());

			
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
	public Students selectStudent(String aadharNumber) {
		Students student =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement 
			ResultSet result = statement.executeQuery("SELECT * FROM STUDENT WHERE AADHAR_NUMBER="+aadharNumber);
			
			//5. process the result if any
			if(result.next()) {
				student = new Students(); //blank object
				
				student.setAadharNumber(result.getString(1));
				student.setStudentName(result.getString(2));
				student.setDOB(result.getDate(3));
				student.setGender(result.getString(4));
				student.setInstituteCode(result.getString(5));
				student.setAccountNumber(result.getString(6));
				student.setPassword(result.getString(7));

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
			ResultSet result = statement.executeQuery("SELECT * FROM STUDENT");
			
			//5. process the result if any
			while(result.next()) {
				Students student = new Students(); //blank object
				
				student.setAadharNumber(result.getString(1));
				student.setStudentName(result.getString(2));
				student.setDOB(result.getDate(3));
				student.setGender(result.getString(4));
				student.setInstituteCode(result.getString(5));
				student.setAccountNumber(result.getString(6));
				student.setPassword(result.getString(7));
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
					conn.prepareStatement("UPDATE STUDENT set student_name=?,dob=?,gender=?,institute_code=?,account_number=?,student_password=? where aadhar_number=?");
			
			
			pst.setString(1, student.getStudentName());
			pst.setDate(2,(Date) student.getDOB());
			pst.setString(3, student.getGender());
			pst.setString(4, student.getInstituteCode());
			pst.setString(5,student.getAccountNumber());
			pst.setString(6, student.getPassword());
			pst.setString(7, student.getAadharNumber());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row MODIFIED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Students> selectStudents(Institute institute) {
		// TODO Auto-generated method stub
		List<Students> studentList = new ArrayList<Students>();
		try {
			
			 
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM STUDENT where institute_code="+institute.getInstituteCode());
			
			//5. process the result if any
			while(result.next()) {
				Students student = new Students(); //blank object
				
				student.setAadharNumber(result.getString(1));
				student.setStudentName(result.getString(2));
				student.setDOB(result.getDate(3));
				student.setGender(result.getString(4));
				student.setInstituteCode(result.getString(5));
				student.setAccountNumber(result.getString(6));
				student.setPassword(result.getString(7));
				studentList.add(student); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentList;
		
	}
	

}