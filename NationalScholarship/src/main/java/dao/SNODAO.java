package dao;

import java.util.List;

import entities.SNO;

public interface SNODAO {
	public void insertSNO(SNO sno);
	public SNO selectSNO(String username);
	public List<SNO> selectSNOs();
	public void updateSNO(SNO sno);
}