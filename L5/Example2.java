class Factory {
    // access modifier
    private String name;
    private String location;
    private int creationYear;

    // constructor
    public Factory(String name, String location, int creationYear) {
        this.name = name;
        this.location = location;
        this.creationYear = creationYear;
    }

    public void display() {
        System.out.println("Factory: " + this.name + " created in " + this.creationYear + " location: " + this.location);
    }

    // getter method (get - вземам)
    public String getName() {
        return name;
    }
}

class CarFactory extends Factory {
    int carsCreated;

    public CarFactory(String name, String location, int creationYear, int carsCreated) {
        super(name, location, creationYear);
        this.carsCreated = carsCreated;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Cars created: " + this.carsCreated);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Factory factory1 = new Factory("MyFactory", "Varna", 2023);
        CarFactory carFact = new CarFactory("Factory11", "Burgas", 2020, 50);

        factory1.display();
        carFact.display();
    }
}
