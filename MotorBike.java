public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String a, String b, String c, Person d, boolean e) {
        super(a, b, c, d);
        this.hasSidecar = e;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + isHasSidecar() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }
}
