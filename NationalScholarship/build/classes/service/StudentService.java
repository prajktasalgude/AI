package service;

import java.util.List;

import entities.Students;
import entities.Institute;

public interface StudentService {
	void createStudentService(Students stud);
	Students findStudentService(String aadharNumber);
	List<Students> findStudentsService();
	List<Students> findStudentsService(Institute institute);
	void modifyStudentService(Students stud);
	void removeStudentService(String aadharNumber);
}
