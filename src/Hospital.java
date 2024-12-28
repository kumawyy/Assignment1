public class Hospital {
    private String hospitalName;
    private Patient[] patients;
    private MedicalProfessional[] medicalProfessionals;
    private int patientCount;
    private int medicalProfessionalCount;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new Patient[100];
        this.medicalProfessionals = new MedicalProfessional[50];  // Max 50 medical professionals
        this.patientCount = 0;
        this.medicalProfessionalCount = 0;
    }

    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount++] = patient;
        } else {
            System.out.println("No more space for new patients.");
        }
    }

    public void addMedicalProfessional(MedicalProfessional medicalProfessional) {
        if (medicalProfessionalCount < medicalProfessionals.length) {
            medicalProfessionals[medicalProfessionalCount++] = medicalProfessional;
        } else {
            System.out.println("No more space for new medical professionals.");
        }
    }

    public void printHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patients:");
        for (int i = 0; i < patientCount; i++) {
            patients[i].printPatientInfo();
        }
        System.out.println("Medical Professionals:");
        for (int i = 0; i < medicalProfessionalCount; i++) {
            medicalProfessionals[i].printMedicalProfessionalInfo();
        }
    }
}
