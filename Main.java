package service;
import java.util.List;

import entities.Students;
import entities.Scholarship;
import entities.Education;
import entities.Personal;


//Only for SNO
public class Main {
	public static void main(String[] args) {
		StudentService studSer=new StudentServiceImplementation();
		ScholarshipService schSer=new ScholarshipServiceImplementation();
		PersonalService perSer=new PersonalServiceImplementation();
		EducationService eduSer=new EducationServiceImplementation();
		
		
		List <Students> studList=studSer.findStudentsService();
//		for(Students st:studList) {
//			Scholarship sch=schSer.findScholarshipService(st.getAadharNumber());
//			System.out.println(sch);
//			System.out.println("---------------");
//			System.out.println();
//		}
		
		for(Students stud:studList) {
			
			Scholarship sch=schSer.findScholarshipService(stud.getAadharNumber());
			
			if(sch!=null && sch.getAlreadyNTSE()<2) {  // && sch.getNTSE()=="Approved") {
//				System.out.println(sch);
//				System.out.println("---------------");
				 Personal per=perSer.findPersonalService(stud.getAadharNumber());
				 if(per!=null && (per.getCaste()=="SC" || per.getCaste()=="ST" || per.isDisable()==true) ) {
					 Education edu=eduSer.findEducationService(stud.getAadharNumber());
					 if( edu!=null && (edu.getNinthPercentage()>=55f) ) { 
						 sch.setNTSE("Verified");
						 schSer.modifyScholarshipService(sch);
					 }
				 }
				 else if(per!=null && per.getCaste()=="OPEN") {
					 Education edu=eduSer.findEducationService(stud.getAadharNumber());
					 if(edu!=null && edu.getNinthPercentage()>=60 ) {
						 sch.setNTSE("Verified");
						 schSer.modifyScholarshipService(sch);
					 }
				 }
				 System.out.println(sch);
			}
			
		}
	}
}
