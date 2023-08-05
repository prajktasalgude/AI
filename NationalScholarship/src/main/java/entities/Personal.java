package entities;

public class Personal {
	private String aadharNumber;
	private String FatherName;
	private String MotherName;
	private boolean maritalStatus;
	private int annualIncome;
	private String caste;
	private boolean isDisable;
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public boolean isDisable() {
		return isDisable;
	}
	public void setDisable(boolean isDisable) {
		this.isDisable = isDisable;
	}
	@Override
	public String toString() {
		return "Personal [aadharNumber=" + aadharNumber + ", FatherName=" + FatherName + ", MotherName=" + MotherName
				+ ", maritalStatus=" + maritalStatus + ", annualIncome=" + annualIncome + ", caste=" + caste
				+ ", isDisable=" + isDisable + "]";
	}

}
