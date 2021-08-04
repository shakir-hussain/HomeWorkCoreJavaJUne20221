package hw8Q6Abstraction03;

public class TestInstitute {

//columbia 
	public static void main(String[] args) {
		System.out.println("columbia methods-----------------------");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();// default constructor initialized
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biology();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.field();
		columbiaUniversity.hygiene();
		columbiaUniversity.teacher();
		columbiaUniversity.physics();
		columbiaUniversity.NYUniversity();
		columbiaUniversity.statistics();
		columbiaUniversity.RockefellerUniversity();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.dorm();
		College.studyRoom();
		columbiaUniversity.morgue();
		Hospital.pharmacy();
		columbiaUniversity.library();
		University.gymnasium();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.MedicalSchool();
		columbiaUniversity.computerLab();
		columbiaUniversity.EngineeringSchool();
		columbiaUniversity.caring();
		columbiaUniversity.NursingSchool();

		// rockefeller
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		rockefellerUniversity.statistics();
		rockefellerUniversity.aeronauticalInfo();
		rockefellerUniversity.mechanicalLab();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.EngineeringSchool();
		rockefellerUniversity.physics();
		rockefellerUniversity.NYUniversity();
		Hospital.pharmacy();
		College.studyRoom();
		University.gymnasium();

		// University //columbia university(Concrete class)
		University university = new ColumbiaUniversity(); // to make object of the interface we used the concrete class
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		College.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		Hospital.pharmacy();
		university.classSize();
		university.field();
		university.teacher();
		university.library();
		University.gymnasium();

		// Hospital
		Hospital hospital = new ColumbiaUniversity();
		hospital.emergencyRoom();
		hospital.surgeryRoom();
		hospital.cafeteria();
		hospital.morgue();
		Hospital.pharmacy();
		College.studyRoom();
		University.gymnasium();

		// Medical School
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		Hospital.pharmacy();
		College.studyRoom();
		University.gymnasium();
		medicalSchool.aeronauticalInfo();
		medicalSchool.physics();
		medicalSchool.NYUniversity();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.EngineeringSchool();
		medicalSchool.statistics();
		medicalSchool.RockefellerUniversity();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.NursingSchool();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();

		// NursingSchool
		NursingSchool nursingSchool = new ColumbiaUniversity();
		Hospital.pharmacy();
		College.studyRoom();
		University.gymnasium();
		nursingSchool.aeronauticalInfo();
		nursingSchool.physics();
		nursingSchool.NYUniversity();
		nursingSchool.mechanicalLab();
		nursingSchool.computerLab();
		nursingSchool.EngineeringSchool();
		nursingSchool.statistics();
		nursingSchool.RockefellerUniversity();
		nursingSchool.hygiene();
		nursingSchool.caring();

	}

}
