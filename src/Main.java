// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Vehicle truck = new Vehicle();
        //display set methods
        truck.setColor("black");
        truck.setEngineSize(456);
        truck.setFuelType("diesel");
        truck.setNumberOfWheels(18);

        //display vehicle get methods
        System.out.println(truck.getEngineSize());
        System.out.println(truck.getFuelType());
        System.out.println(truck.getColor());
        System.out.println(truck.getNumberOfWheels());

        Car tesla = new Car();

        tesla.setColor("yellow");
        tesla.setBrand("Tesla");
        tesla.setEngineSize(789);
        tesla.setNumberOfWheels(4);
        tesla.setFuelType("Energy");

        System.out.println(tesla.getEngineSize());
        System.out.println(tesla.getFuelType());
        System.out.println(tesla.getColor());
        System.out.println(tesla.getNumberOfWheels());
        System.out.println(tesla.getBrand());


    }
}