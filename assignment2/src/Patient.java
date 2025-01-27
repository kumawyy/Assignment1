public class Patient extends Person {
    private int age;
    private String illness;

    public Patient(String name, int age, String illness) {
        super(name);
        this.age = age;
        this.illness = illness;
    }

    @Override
    public void printInfo() {
        System.out.println("Patient: " + getName() + ", Age: " + age + ", Illness: " + illness);
    }

    public void treat() {
        System.out.println("Treating patient " + getName() + " for " + illness);
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return "Patient{name='" + getName() + "', age=" + age + ", illness='" + illness + "'}";
    }
}
