class PersonalDetails {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    // Constructor
    public PersonalDetails(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        // Creating an instance of PersonalDetails
        PersonalDetails person = new PersonalDetails(
                "John Doe",
                "123 Main St, Cityville",
                25,
                "555-1234"
        );

        // Displaying personal details
        person.displayDetails();
    }
}
