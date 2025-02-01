package projects;

public class Moduletwo {
    // Private data
    private String name;

    // Default constructor
    public Moduletwo() {
        // Using set method to initialize
        setName("Pet Name");
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // toString method to return object state
    public String toString() {
        return "Pet information:\nName: " + name;
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate first Pet object using default constructor
        Moduletwo pet1 = new Moduletwo();
        System.out.println(pet1);

        // Instantiate second Pet object using set method
        Moduletwo pet2 = new Moduletwo();
        pet2.setName("Buster");
        System.out.println(pet2);
    }
}
