package enrolsystem

class Course {
	String department;
	String courseTitle;
	String courseLeader;
	String courseCode;
	Date startDate;
	Date endDate;
	String description;
	int numberOfStudents;
	double tuitionFees;
	String studyMode;


    static constraints = {
	courseTitle nullable: false, blank: false
	department nullable: false, blank: false
	courseLeader nullable: false, blank: false
	courseCode nullable: false, blank: false
	numberOfStudents nullable: false, blank: false, min: 20, max: 60
	startDate nullable: false, blank: false
	endDate nullable: false, blank: false
	studyMode nullable: false, blank: false, minSize: 7
	description nullable: false, blank: false, maxSize: 5000, widget:'textarea'
	tuitionFees nullable: false, blank: false, scale: 2

    }
}
