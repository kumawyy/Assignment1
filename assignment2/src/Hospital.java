public class Hospital {
    private String hospitalName;
    private Person[] people;
    private int peopleCount = 0;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.people = new Person[20];
    }

    public void addPerson(Person person) {
        if (peopleCount < people.length) {
            people[peopleCount++] = person;
        } else {
            System.out.println("Hospital people list is full.");
        }
    }

    public void printHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        for (int i = 0; i < peopleCount; i++) {
            people[i].printInfo();
        }
    }

    public Person searchPersonByName(String name) {
        for (int i = 0; i < peopleCount; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return people[i];
            }
        }
        return null;
    }

    public void treatAll() {
        System.out.println("Treating all patients and doctors in the hospital...");
        for (int i = 0; i < peopleCount; i++) {
            if (people[i] instanceof Patient) {
                ((Patient) people[i]).treat();
            } else if (people[i] instanceof MedicalProfessional) {
                ((MedicalProfessional) people[i]).treat();
            }
        }
    }
}
