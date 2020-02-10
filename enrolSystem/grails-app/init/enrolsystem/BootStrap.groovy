package enrolsystem

class BootStrap {

    def init = { servletContext ->
	def newCourse=new Course(
	department: 'Computing',
	courseCode: 'CS123',
	courseTitle: 'BSc Hon Computing',
	courseLeader: 'Dr Michelle Murphy',
	startDate:new Date ('09/09/2019'),
	endDate:new Date ('07/07/2023'),
	numberOfStudents: '55',
	studyMode: 'Fulltime',
	tuitionFees: '9000.60',
	description: '"Placeholder text content."'
	).save()

	def compSci=new Course(
	department: 'Computing',
	courseCode: 'CS456',
	courseTitle: 'BSc Hon Computer Science',
	courseLeader: 'Dr Science',
	startDate:new Date ('09/09/2019'),
	endDate:new Date ('07/07/2023'),
	numberOfStudents: '47',
	studyMode: 'Fulltime',
	tuitionFees: '9000.60',
	description: '"Placeholder text content."'
	).save()

	def compNet=new Course(
	department: 'Computing',
	courseCode: 'CS987',
	courseTitle: 'BSc Hon Networking',
	courseLeader: 'Dr Networkman',
	startDate:new Date ('09/09/2019'),
	endDate:new Date ('07/07/2023'),
	numberOfStudents: '48',
	studyMode: 'Fulltime',
	tuitionFees: '9000.60',
	description: '"Placeholder text content."'
	).save()



    }
    def destroy = {
    }
}
