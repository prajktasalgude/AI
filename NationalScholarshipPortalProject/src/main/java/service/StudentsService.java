package service;

import java.util.List;
import entities.Students;

public interface StudentsService {
	void createStudentService(Students dept);
	Students findStudentService(String aadharNumber);
	List<Students> findStudentsService();
	void modifyStudentService(Students dept);
	//void removeStudentService(String aadharNumber);
}
