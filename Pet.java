package projects;

public class Pet {
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.name = "Pet Name";
        this.type = "Cat";
        this.age = 1;
    }

    // Custom constructor
    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    // Setter (mutator) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter (accessor) methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // Speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof!";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow!";
        } else {
            return "Meow!";
        }
    }

    // toString method
    public String toString() {
        return "Pet information:\n" +
               "Type: " + type + "\n" +
               "Name: " + name + "\n" +
               "Sound: " + speak() + "\n" +
               "Age: " + age;
    }
}
