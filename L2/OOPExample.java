// Base class (superclass)
class Factory {
  // Instance variables
  String name;
  String location;
  int yearEstablished;

  // Constructor
  public Factory(String name, String location, int yearEstablished) {
    this.name = name;
    this.location = location;
    this.yearEstablished = yearEstablished;
  }

  // Method to display information about the factory
  public void displayInfo() {
    System.out.println("Factory: " + this.name + " (Est. " + this.yearEstablished + "), Location: " + this.location);
  }
}

// Derived class (subclass)
class SportsCarFactory extends Factory {
  // Additional instance variable specific to SportsCarFactory
  boolean producesHighPerformanceCars;

  // Constructor calling the superclass constructor
  public SportsCarFactory(String name, String location, int yearEstablished, boolean producesHighPerformanceCars) {
    super(name, location, yearEstablished);
    this.producesHighPerformanceCars = producesHighPerformanceCars;
  }

  // Overriding the displayInfo method of the superclass
  @Override
  public void displayInfo() {
    // Using super to call the displayInfo method of the superclass
    super.displayInfo();
    System.out.println("Produces High-Performance Cars: " + producesHighPerformanceCars);
  }
}

public class OOPExample {
  public static void main(String[] args) {
    // Creating instances of Factory and SportsCarFactory
    Factory myFactory = new Factory("ABC Motors", "Detroit", 1980);
    SportsCarFactory mySportsCarFactory = new SportsCarFactory("XYZ Racing", "Italy", 1995, true);

    // Calling methods on the objects
    myFactory.displayInfo();
    System.out.println(); // Adding a newline for clarity
    mySportsCarFactory.displayInfo();
  }
}
