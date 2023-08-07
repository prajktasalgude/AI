package dao;

import java.util.List;

import entities.Personal;

public interface PersonalDAO {
	
	public void insertPersonal(Personal per); //C
	public Personal selectPersonal(String aadharNumber);//R
	public List<Personal> selectPersonals(); //RA
	public void updatePersonal(Personal per); //U

}
