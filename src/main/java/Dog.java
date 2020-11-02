public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public Dog(){
        super("Max",5);
        this.breed = "Labrador";
    }

    // makeNoise() method
    public void makeNoise(){
        System.out.println("Woof!");
    }

    // toString method
    public String toString(){
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
        this.breed = breed;
    }
}