public class MedicalProfessional {
    private String name;
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void printMedicalProfessionalInfo() {
        System.out.println("Medical Professional: " + name + ", Specialization: " + specialization);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MedicalProfessional) {
            MedicalProfessional other = (MedicalProfessional) obj;
            return this.name.equals(other.name) && this.specialization.equals(other.specialization);
        }
        return false;
    }
}
