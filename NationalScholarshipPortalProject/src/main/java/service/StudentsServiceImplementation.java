package service;

import java.util.List;
import entities.Students;
import dao.StudentsDao;
import dao.StudentsDaoImplementation;
public class StudentsServiceImplementation implements StudentsService{
		StudentsDao studDao=new StudentsDaoImplementation();
	@Override
	public void createStudentService(Students student) {
		studDao.insertStudent(student);
		
	}

	@Override
	public Students findStudentService(String aadharNumber) {
		return studDao.selectStudent(aadharNumber);
	}

	@Override
	public List<Students> findStudentsService() {
		return studDao.selectStudents();
	}

	@Override
	public void modifyStudentService(Students dept) {
		studDao.updateStudent(dept);
		
	}

}