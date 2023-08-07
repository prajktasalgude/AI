package entities;

public class Education {
	
	private String aadharNumber;
	private float tenthPercentage;
	private float twelthPercentage;
	private float ninthPercentage;
	private int admissionFee;
	private int tuitionFee;
	private int tenthYear;
	private int twelthYear;
	private int ninthYear;
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public float getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(float tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public float getTwelthPercentage() {
		return twelthPercentage;
	}
	public void setTwelthPercentage(float twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}
	public float getNinthPercentage() {
		return ninthPercentage;
	}
	public void setNinthPercentage(float ninthPercentage) {
		this.ninthPercentage = ninthPercentage;
	}
	public int getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(int admissionFee) {
		this.admissionFee = admissionFee;
	}
	public int getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(int tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public int getTenthYear() {
		return tenthYear;
	}
	public void setTenthYear(int tenthYear) {
		this.tenthYear = tenthYear;
	}
	public int getTwelthYear() {
		return twelthYear;
	}
	public void setTwelthYear(int twelthYear) {
		this.twelthYear = twelthYear;
	}
	public int getNinthYear() {
		return ninthYear;
	}
	public void setNinthYear(int ninthYear) {
		this.ninthYear = ninthYear;
	}
	
	@Override
	public String toString() {
		return "Education [aadharNumber=" + aadharNumber + ", tenthPercentage=" + tenthPercentage
				+ ", twelthPercentage=" + twelthPercentage + ", ninthPercentage=" + ninthPercentage + ", admissionFee="
				+ admissionFee + ", tuitionFee=" + tuitionFee + ", tenthYear=" + tenthYear + ", twelthYear="
				+ twelthYear + ", ninthYear=" + ninthYear + "]";
	}
}