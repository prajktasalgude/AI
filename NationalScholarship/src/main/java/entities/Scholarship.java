package entities;

public class Scholarship {
	private String aadharNumber;
	private String NTSE;
	private String Pragati;
	private String PMS;
	private int alreadyNTSE;
	private int alreadyPragati;
	private int alreadyPMS;
	

	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getNTSE() {
		return NTSE;
	}
	public void setNTSE(String nTSE) {
		NTSE = nTSE;
	}
	public String getPragati() {
		return Pragati;
	}
	public void setPragati(String pragati) {
		Pragati = pragati;
	}
	public String getPMS() {
		return PMS;
	}
	public void setPMS(String pMS) {
		PMS = pMS;
	}
	public int getAlreadyNTSE() {
		return alreadyNTSE;
	}
	public void setAlreadyNTSE(int alreadyNTSE) {
		this.alreadyNTSE = alreadyNTSE;
	}
	public int getAlreadyPragati() {
		return alreadyPragati;
	}
	public void setAlreadyPragati(int alreadyPragati) {
		this.alreadyPragati = alreadyPragati;
	}
	public int getAlreadyPMS() {
		return alreadyPMS;
	}
	public void setAlreadyPMS(int alreadyPMS) {
		this.alreadyPMS = alreadyPMS;
	}

	@Override
	public String toString() {
		return "Scholarship [aadharNumber=" + aadharNumber + ", NTSC=" + NTSE + ", Pragati=" + Pragati + ", PMS=" + PMS
				+ ", alreadyNTSC=" + alreadyNTSE + ", alreadyPragati=" + alreadyPragati + ", alreadyPMS=" + alreadyPMS
				+ "]";
	}	
	
}