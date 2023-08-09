package working;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Contact;
import entities.Education;
import entities.Personal;
import entities.Scholarship;
import service.ContactService;
import service.ContactServiceImplementation;
import service.EducationService;
import service.EducationServiceImplementation;
import service.PersonalService;
import service.PersonalServiceImplementation;
import service.ScholarshipService;
import service.ScholarshipServiceImplementation;

public class StudentAplication {
	
	ContactService contactSer=new ContactServiceImplementation();
	EducationService eduSer=new EducationServiceImplementation();
	PersonalService perSer=new PersonalServiceImplementation();
	ScholarshipService schSer=new ScholarshipServiceImplementation();
	
	@Test
	public void createTest() {

		Contact contact=new Contact();
	Assertions.assertTrue(contact!=null);
	System.out.println("Contact is created....");
	contact.setAadharNumber("765865887998");
	contact.setInstituteCode("7689");
	contact.setState("Maharashtra");
	contact.setDistrict("Sambhajinagar");
	contact.setAddressLine("Kranti Chowk, Sambhajinagar");
	contact.setPincode("431005");
	contact.setMobileNumber("9787565345");
	contact.setEmail("ram@gmail.com");
	contactSer.createContactService(contact);
	
	Education edu=new Education();
	Assertions.assertTrue(edu!=null);
	edu.setAadharNumber("765865887998");
	edu.setNinthPercentage(89);
	edu.setNinthYear(2022);
	edu.setAdmissionFee(7500);
	edu.setTuitionFee(25000);
	eduSer.createEducationService(edu);

	Personal per=new Personal();
	Assertions.assertTrue(per!=null);
	per.setAadharNumber("765865887998");
	per.setFatherName("Shan Patil");
	per.setMotherName("Sita Patil");
	per.setMaritalStatus(false);
	per.setAnnualIncome(250000);
	per.setCaste("OPEN");
	per.setDisable(false);
	perSer.createPersonalService(per);
	
	Scholarship sch = new Scholarship();
	System.out.println("bank created....");
	Assertions.assertTrue(sch!=null);
	sch.setAadharNumber("765865887998");
	sch.setNTSE("Applied");
	sch.setPragati(null);
	sch.setPMS(null);
	sch.setAlreadyNTSE(1);
	sch.setAlreadyPragati(2);
	sch.setAlreadyPMS(0);
	schSer.createScholarshipService(sch);
	}
	
	@Test
	 public void selectTest() {
		Contact contact=contactSer.findContactService("765865887998");
		System.out.println(contact);
		
		Education edu=eduSer.findEducationService("765865887998");
		System.out.println(edu);
		
		Personal per=perSer.findPersonalService("765865887998");
		System.out.println(per);
		
		Scholarship sch=schSer.findScholarshipService("765865887998");
		System.out.println(sch);
	}

}
