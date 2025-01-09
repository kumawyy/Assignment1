import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ayadil", 16, "Flu");
        Patient patient2 = new Patient("Almas", 60, "Diabetes");

        MedicalProfessional doctor1 = new MedicalProfessional("Dr. Sanzhar", "Therapist");
        MedicalProfessional doctor2 = new MedicalProfessional("Dr. Leonardo", "Endocrinologist");

        Hospital hospital = new Hospital("City Hospital");

        hospital.addPerson(patient1);
        hospital.addPerson(patient2);
        hospital.addPerson(doctor1);
        hospital.addPerson(doctor2);

        hospital.printHospitalInfo();
        hospital.treatAll();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the person to search: ");
        String nameToSearch = scanner.nextLine();  // Считываем имя

        Person foundPerson = hospital.searchPersonByName(nameToSearch);

        if (foundPerson != null) {
            System.out.println("Found Person: " + foundPerson);
        } else {
            System.out.println("Person not found.");
        }

        scanner.close();
    }
}
