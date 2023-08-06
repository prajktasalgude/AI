package service;

import java.util.List;

import entities.Students;

public interface StudentService {
	void createStudentService(Students stud);
	Students findStudentService(String aadharNumber);
	List<Students> findStudentsService();
	void modifyStudentService(Students stud);
	void removeStudentService(String aadharNumber);
}
