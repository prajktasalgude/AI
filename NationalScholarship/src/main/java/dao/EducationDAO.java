package dao;

import java.util.List;

import entities.Education;

public interface EducationDAO {

	void createEducation(Education education);
	Education selectEducation(String aadharNumber);
	List<Education> selectEducations();
	void updateEducation(Education education);
}