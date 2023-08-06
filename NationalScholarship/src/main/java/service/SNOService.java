package service;

import java.util.List;

import entities.SNO;

public interface SNOService {
	void createSNOService(SNO sno);
	SNO findSNOService(String username);
	List<SNO> findSNOService();
	void modifySNOService(SNO sno);
	void removeSNOService(String aadhartNumber);
}
