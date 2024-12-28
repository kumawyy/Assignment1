public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ayadil", 16, "Flu");
        Patient patient2 = new Patient("Almas", 60, "Diabetes");

        MedicalProfessional doctor1 = new MedicalProfessional("Dr. sanzhar", "Therapist");
        MedicalProfessional doctor2 = new MedicalProfessional("Dr. leonardo", "Endocrinologist");

        Hospital hospital = new Hospital("City Hospital");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addMedicalProfessional(doctor1);
        hospital.addMedicalProfessional(doctor2);

        hospital.printHospitalInfo();

        if (patient1.equals(patient2)) {
            System.out.println("Patients are the same.");
        } else {
            System.out.println("Patients are different.");
        }

        if (doctor1.equals(doctor2)) {
            System.out.println("Doctors are the same.");
        } else {
            System.out.println("Doctors are different.");
        }
    }
}
