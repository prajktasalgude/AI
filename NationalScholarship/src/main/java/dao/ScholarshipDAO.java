package dao;
import java.util.List;

//import entities.Contact;
import entities.Scholarship;

public interface ScholarshipDAO {
	public void insertScholarship(Scholarship scholarship);
	public Scholarship selectScholarship(String aadaharNumber);
	public List<Scholarship> selectScholarships();
	public void updateScholarship(Scholarship scholarship);
}