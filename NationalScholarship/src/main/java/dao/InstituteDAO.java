package dao;

import java.util.List;

import entities.Institute;


public interface InstituteDAO {
	public void insertInstitute(Institute institute); //C
	public Institute selectInstitute(String aadharNumber);//R
	public List<Institute> selectInstitutes(); //RA
	public void updateInstitute(Institute institute);
}
