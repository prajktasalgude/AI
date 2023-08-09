package working;

import java.util.List;

import org.junit.Test;

import entities.Education;
import entities.Personal;
import entities.Scholarship;
import entities.Students;
import service.EducationService;
import service.EducationServiceImplementation;
import service.PersonalService;
import service.PersonalServiceImplementation;
import service.ScholarshipService;
import service.ScholarshipServiceImplementation;
import service.StudentService;
import service.StudentServiceImplementation;

public class SNOLogin {

	StudentService studSer=new StudentServiceImplementation();
	ScholarshipService schSer=new ScholarshipServiceImplementation();
	PersonalService perSer=new PersonalServiceImplementation();
	EducationService eduSer=new EducationServiceImplementation();
	
	@Test
	public void StudentVerificationNTSE() {
	List <Students> studList=studSer.findStudentsService();		
	for(Students stud:studList) {
		
		Scholarship sch=schSer.findScholarshipService(stud.getAadharNumber());
		if(sch!=null && sch.getNTSE().equals("Verified")) {
			
			System.out.println(sch);
		}
		else if(sch!=null && sch.getPMS().equals("Verified")) {
			
			System.out.println(sch);
		}
		else if(sch!=null && sch.getPragati().equals("Verified")) {
			
			System.out.println(sch);
		}
		
		
		if(sch!=null && sch.getAlreadyNTSE()<2 && sch.getNTSE().equals("Approved")) {
			 Personal per=perSer.findPersonalService(stud.getAadharNumber());
			 if(per!=null ) {
				 if(per.getCaste().equals("SC") || per.getCaste().equals("ST") || per.isDisable()==true)  {
			 
				 Education edu=eduSer.findEducationService(stud.getAadharNumber());
				 if( edu!=null && (edu.getNinthPercentage()>=55f) ) { 
					 sch.setNTSE("Verified");
					 schSer.modifyScholarshipService(sch);
					 System.out.println(sch);
				 }
			 }
			 else if(per.getCaste().equals("OPEN")) {
				 Education edu=eduSer.findEducationService(stud.getAadharNumber());
				 if(edu!=null && edu.getNinthPercentage()>=60 ) {
					 sch.setNTSE("Verified");
					 schSer.modifyScholarshipService(sch);
					 System.out.println(sch);
				 }
			 }
		}
			 
	}
		if(sch!=null && sch.getAlreadyPMS()<2 && sch.getPMS().equals("Approved")) {
			Personal per=perSer.findPersonalService(stud.getAadharNumber());
			 if(per!=null ) {
				 if(per.getAnnualIncome()<=800000 && (per.getCaste().equals("SC") || per.getCaste().equals("ST") || per.isDisable()==true))  {
			 
				 Education edu=eduSer.findEducationService(stud.getAadharNumber());
				 if( edu!=null && (edu.getTenthPercentage()>=60f && edu.getTwelthPercentage()>=60f  ) ) { 
					 sch.setNTSE("Verified");
					 schSer.modifyScholarshipService(sch);
					 System.out.println(sch);
				 }
			 }
		
	}
	
	}
		if(stud.getGender().equals("Female")) {
			if(sch!=null && sch.getAlreadyPragati()<2 && sch.getPragati().equals("Approved")) {
		}
			Personal per=perSer.findPersonalService(stud.getAadharNumber());
			 if(per!=null ) {
				 if(per.getAnnualIncome()<=800000 )  {
			 
				 Education edu=eduSer.findEducationService(stud.getAadharNumber());
				 if( edu!=null && (edu.getTenthPercentage()>=60f && edu.getTwelthPercentage()>=60f  ) ) { 
					 sch.setNTSE("Verified");
					 schSer.modifyScholarshipService(sch);
					 System.out.println(sch);
				 }
			 }
		
	}
		}
	}
	}
}
