import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalDatabase {

    public static void addPatient(String name, int age, String illness) {
        try (Connection conn = DatabaseConnection.connect()) {
            String insertPerson = "INSERT INTO person (name) VALUES (?) RETURNING id";
            PreparedStatement stmt = conn.prepareStatement(insertPerson);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int personId = rs.getInt(1);
                String insertPatient = "INSERT INTO patient (person_id, age, illness) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertPatient);
                ps.setInt(1, personId);
                ps.setInt(2, age);
                ps.setString(3, illness);
                ps.executeUpdate();
                System.out.println("Patient added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addMedicalProfessional(String name, String specialization) {
        try (Connection conn = DatabaseConnection.connect()) {
            String insertPerson = "INSERT INTO person (name) VALUES (?) RETURNING id";
            PreparedStatement stmt = conn.prepareStatement(insertPerson);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int personId = rs.getInt(1);
                String insertDoctor = "INSERT INTO medical_professional (person_id, specialization) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertDoctor);
                ps.setInt(1, personId);
                ps.setString(2, specialization);
                ps.executeUpdate();
                System.out.println("Medical professional added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePatient(String name) {
        try (Connection conn = DatabaseConnection.connect()) {
            String deletePatientQuery = "DELETE FROM patient WHERE person_id = (SELECT id FROM person WHERE name = ?)";
            PreparedStatement stmt = conn.prepareStatement(deletePatientQuery);
            stmt.setString(1, name);
            stmt.executeUpdate();

            String deletePersonQuery = "DELETE FROM person WHERE name = ?";
            stmt = conn.prepareStatement(deletePersonQuery);
            stmt.setString(1, name);
            stmt.executeUpdate();

            System.out.println("Patient deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMedicalProfessional(String name) {
        try (Connection conn = DatabaseConnection.connect()) {
            String deleteDoctorQuery = "DELETE FROM medical_professional WHERE person_id = (SELECT id FROM person WHERE name = ?)";
            PreparedStatement stmt = conn.prepareStatement(deleteDoctorQuery);
            stmt.setString(1, name);
            stmt.executeUpdate();

            String deletePersonQuery = "DELETE FROM person WHERE name = ?";
            stmt = conn.prepareStatement(deletePersonQuery);
            stmt.setString(1, name);
            stmt.executeUpdate();

            System.out.println("Medical professional deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchPatient(String name) {
        try (Connection conn = DatabaseConnection.connect()) {
            String searchQuery = "SELECT p.name, pt.age, pt.illness FROM person p INNER JOIN patient pt ON p.id = pt.person_id WHERE p.name = ?";
            PreparedStatement stmt = conn.prepareStatement(searchQuery);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Patient Found: ");
                System.out.println("Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Illness: " + rs.getString("illness"));
            } else {
                System.out.println("Patient not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchMedicalProfessional(String name) {
        try (Connection conn = DatabaseConnection.connect()) {
            String searchQuery = "SELECT p.name, mp.specialization FROM person p INNER JOIN medical_professional mp ON p.id = mp.person_id WHERE p.name = ?";
            PreparedStatement stmt = conn.prepareStatement(searchQuery);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Medical Professional Found: ");
                System.out.println("Name: " + rs.getString("name") + ", Specialization: " + rs.getString("specialization"));
            } else {
                System.out.println("Medical professional not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
