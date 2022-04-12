public class Car extends Vehicle {
    private int numberOfDoors;
    /**
     * constructor.
     */

    public Car(String a, String b, String c, Person d, int e) {
        super(a, b, c, d);
        this.numberOfDoors = e;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + getNumberOfDoors() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }
}
