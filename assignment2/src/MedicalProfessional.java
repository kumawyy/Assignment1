public class MedicalProfessional extends Person {
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    @Override
    public void printInfo() {
        System.out.println("Medical Professional: " + getName() + ", Specialization: " + specialization);
    }

    public void treat() {
        System.out.println("Doctor " + getName() + " is treating patients as a " + specialization);
    }

    @Override
    public String toString() {
        return "MedicalProfessional{name='" + getName() + "', specialization='" + specialization + "'}";
    }
}
