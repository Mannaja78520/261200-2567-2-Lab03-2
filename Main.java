public class Main {
  public static void main(String[] args) {
      int currentYear = 2024; 
      Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "B", "0123456789");
      patient.displayDetails(currentYear);
      Patient invalidPatient = new Patient(1005, "Doe John", -1, -2, -3, "C", "9876543210");
      invalidPatient.displayDetails(currentYear);
    }
}
