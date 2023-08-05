package dao;
import java.util.List;

import entities.Students;

public interface StudentsDAO {
	public void insertStudent(Students student); //C
	public Students selectStudent(String aadharNumber);//R
	public List<Students> selectStudents(); //RA
	public void updateStudent(Students student); //U
	//public void deleteStudent(String aadharNumber);  //D
}
