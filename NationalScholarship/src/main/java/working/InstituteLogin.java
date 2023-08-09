package working;

import java.util.List;

public class InstituteLogin {

	StudentService studSer=new StudentServiceImplementation();
	ScholarshipService schSer=new ScholarshipServiceImplementation();
	@Test
	public void StudentApprovalTest() {
	List <Students> studList=studSer.findStudentsService();		
	for(Students stud:studList) {
		
		Scholarship sch=schSer.findScholarshipService(stud.getAadharNumber());
		if(sch!=null && sch.getNTSE().equals("Applied") ) {
			
			sch.setNTSE("Approved");
			schSer.modifyScholarshipService(sch);
			System.out.println(sch);
		}
		if(sch!=null && sch.getPMS().equals("Applied") ) {
			
			sch.setPMS("Approved");
			schSer.modifyScholarshipService(sch);
			System.out.println(sch);
		}
		if(sch!=null && sch.getPragati().equals("Applied") ) {
			
			sch.setPragati("Approved");
			schSer.modifyScholarshipService(sch);
			System.out.println(sch);
		}
	}
}
