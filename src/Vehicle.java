public class Vehicle {

    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    public Vehicle(){
        numberOfWheels = 4;
        color = "Black";
        engineSize =  123;
        fuelType = "Regular";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }


    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
    class Car extends Vehicle{
    String brand;
    public void honk(){
        System.out.println("Honk, honk!");
    }
    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getEngineSize());
        System.out.println(getFuelType());
        System.out.println(getNumberOfWheels());
        System.out.println(getBrand());
    }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
    }




