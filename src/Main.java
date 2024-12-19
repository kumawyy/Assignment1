public class Main {

    static class Patient {
        private String name;
        private int age;
        private String patientID;
        private String ailment;

        public Patient(String name, int age, String patientID, String ailment) {
            this.name = name;
            this.age = age;
            this.patientID = patientID;
            this.ailment = ailment;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public String getPatientID() { return patientID; }
        public void setPatientID(String patientID) { this.patientID = patientID; }

        public String getAilment() { return ailment; }
        public void setAilment(String ailment) { this.ailment = ailment; }

        public void printDetails() {
            System.out.println("Patient [Name: " + name + ", Age: " + age + ", ID: " + patientID + ", Ailment: " + ailment + "]");
        }
    }

    static class MedicalProfessional {
        private String name;
        private String specialization;
        private String professionalID;

        public MedicalProfessional(String name, String specialization, String professionalID) {
            this.name = name;
            this.specialization = specialization;
            this.professionalID = professionalID;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getSpecialization() { return specialization; }
        public void setSpecialization(String specialization) { this.specialization = specialization; }

        public String getProfessionalID() { return professionalID; }
        public void setProfessionalID(String professionalID) { this.professionalID = professionalID; }

        public void printDetails() {
            System.out.println("Medical Professional [Name: " + name + ", Specialization: " + specialization + ", ID: " + professionalID + "]");
        }
    }

    static class Hospital {
        private String name;
        private String location;
        private int capacity;
        private Patient patient1;
        private Patient patient2;

        public Hospital(String name, String location, int capacity) {
            this.name = name;
            this.location = location;
            this.capacity = capacity;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }

        public int getCapacity() { return capacity; }
        public void setCapacity(int capacity) { this.capacity = capacity; }

        public void setPatient1(Patient patient) { this.patient1 = patient; }
        public void setPatient2(Patient patient) { this.patient2 = patient; }

        public void printDetails() {
            System.out.println("Hospital [Name: " + name + ", Location: " + location + ", Capacity: " + capacity + "]");
            if (patient1 != null) patient1.printDetails();
            if (patient2 != null) patient2.printDetails();
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Aslan", 18, "P001", "Flu");
        Patient patient2 = new Patient("Ayadil", 17, "P002", "Fever");

        MedicalProfessional doctor = new MedicalProfessional("Dr. Asel", "Cardiology", "D001");

        Hospital hospital = new Hospital("City Hospital", "Astana", 2);
        hospital.setPatient1(patient1);
        hospital.setPatient2(patient2);

        System.out.println("Hospital Details:");
        hospital.printDetails();

        System.out.println("\nMedical Professional Details:");
        doctor.printDetails();
    }
}
