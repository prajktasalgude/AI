import java.util.List;

public class StudentsServiceImplementation implements StudentsService{
		StudentsDAO studDao=new StudentsDaoImplementation();
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
