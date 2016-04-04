package com.seminar;

public class SeminarData {


	Seminar s = new Seminar("10 A.M", "11 A.M");
	Address a = new Address("B060", "Beckman Center", "Stanford", "CA");
	Contact c = new Contact("Manolia", "Margaris", "(650) 723-9151", "manolia@stanford.edu");
	Presenters p = new Presenters("Larry", "Gold", "PhD Professor", "University of Colorado,", "Structural Biology");
	
	public String toString() {
		return s.seminarName + "\n\n" +
				s.date + " | " + s.startTime + " - " + s.endTime + "\n" +
				"Munzer Auditorium - " + a.address1 + " " + a.address2 + ": " + a.city + ", " + a.state + "\n\n" +
				"Department: " + p.preDepartment + "\n\n" +
				"Contact: " + c.firstName + " " + c.lastName + " | " + c.phoneNumber + " | " + c.emailId + "\n\n" +
				"Presenter(s):\n\n" + 
				p.firstName + " " + p.lastName + " " + p.preQualification + " " + p.preUniversity;
	}
}
