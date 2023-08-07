package dao;
import java.util.List;

import entities.Students;
import entities.Institute;

public interface StudentsDAO {
	public void insertStudent(Students student); //C
	public Students selectStudent(String aadharNumber);//R
	public List<Students> selectStudents(); //RA
	public List<Students> selectStudents(Institute institute);
	public void updateStudent(Students student); //U
	//public void deleteStudent(String aadharNumber);  //D
}
