package service;
import java.util.List;

import dao.EducationDAO;
import dao.EducationDAOImplementation;
import entities.Education;

public class Main {
	public static void main(String[] args) {
		EducationDAO eduDAO=new EducationDAOImplementation();
		List<Education> eduObj = eduDAO.selectEducations();
		for (Education edu: eduObj) {
			System.out.println("Student Obj : "+edu);
			
			}
	}
}
