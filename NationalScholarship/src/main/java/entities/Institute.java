package entities;

public class Institute {

		private String instituteCode;
		private String instituteName;
		private String principleName;
		private String location;
		private String institutePassword;
		private boolean verified;
		public String getInstituteCode() {
			return instituteCode;
		}
		public void setInstituteCode(String instituteCode) {
			this.instituteCode = instituteCode;
		}
		public String getInstituteName() {
			return instituteName;
		}
		public void setInstituteName(String instituteName) {
			this.instituteName = instituteName;
		}
		public String getPrincipleName() {
			return principleName;
		}
		public void setPrincipleName(String principleName) {
			this.principleName = principleName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getInstitutePassword() {
			return institutePassword;
		}
		public void setInstitutePassword(String institutePassword) {
			this.institutePassword = institutePassword;
		}
		public boolean isVerified() {
			return verified;
		}
		public void setVerified(boolean verified) {
			this.verified = verified;
		}
		@Override
		public String toString() {
			return "Institute [instituteCode=" + instituteCode + ", instituteName=" + instituteName + ", principleName="
					+ principleName + ", location=" + location + ", institutePassword=" + institutePassword
					+ ", verified=" + verified + "]";
		}
		
		
}
