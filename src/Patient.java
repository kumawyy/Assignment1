public class Patient {
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void printPatientInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Patient) {
            Patient other = (Patient) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}
