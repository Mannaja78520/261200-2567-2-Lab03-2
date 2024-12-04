public class Patient {
    private long id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    private int defaultBirthYear = 2000;
    private double defaultHeight = 150.00;
    private double defaultWeight = 50.00;
    
    public Patient(long id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;

        if (birthYear < 0) {
            System.out.println("Invite birthday input change to defaultBirthYear.");
            this.birthYear = this.defaultBirthYear;
        }
        else this.birthYear = birthYear;
        
        if (height < 0) System.out.println("Invalid height input.");
        else this.height = height;

        if (weight < 0) System.out.println("Invalid weight input.");
        else this.weight = weight;

        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return this.id;
    }

    public double getHeight() {
        return this.height;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }

    public String getName() {
        return this.name;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getBMI() {
        if (weight == 0.0 || height == 0.0) return 0.0;
        return this.weight / Math.pow(this.height / 100, 2);
    }

    public void displayDetails(int currentYear) { 
        System.out.println("Patient Name: " + name); 
        System.out.println("Patient Age: " + getAge(currentYear)); 
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + bloodGroup);
        System.out.println("Patient Phone Number: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
      }
  
      
}
