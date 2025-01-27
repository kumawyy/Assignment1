import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add a Patient");
            System.out.println("2. Add a Medical Professional");
            System.out.println("3. Delete a Patient");
            System.out.println("4. Delete a Medical Professional");
            System.out.println("5. Search for a Patient");
            System.out.println("6. Search for a Medical Professional");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the patient's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the patient's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the patient's illness: ");
                    String illness = scanner.nextLine();
                    HospitalDatabase.addPatient(name, age, illness);
                }
                case 2 -> {
                    System.out.print("Enter the medical professional's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the medical professional's specialization: ");
                    String specialization = scanner.nextLine();
                    HospitalDatabase.addMedicalProfessional(name, specialization);
                }
                case 3 -> {
                    System.out.print("Enter the patient's name to delete: ");
                    String name = scanner.nextLine();
                    HospitalDatabase.deletePatient(name);
                }
                case 4 -> {
                    System.out.print("Enter the medical professional's name to delete: ");
                    String name = scanner.nextLine();
                    HospitalDatabase.deleteMedicalProfessional(name);
                }
                case 5 -> {
                    System.out.print("Enter the patient's name to search: ");
                    String name = scanner.nextLine();
                    HospitalDatabase.searchPatient(name);
                }
                case 6 -> {
                    System.out.print("Enter the medical professional's name to search: ");
                    String name = scanner.nextLine();
                    HospitalDatabase.searchMedicalProfessional(name);
                }
                case 7 -> {
                    exit = true;
                    System.out.println("Exiting the program...");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
