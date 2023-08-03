import java.util.List;

public interface PragatiScholarshipDao {
	public void insertStudent(Students student); //C
	public Students selectStudent(String aadharNumber);//R
	public List<Students> selectStudents(); //RA
	public void updateStudent(Students student); //U
	//public void deleteStudent(String aadharNumber);  //D
}

