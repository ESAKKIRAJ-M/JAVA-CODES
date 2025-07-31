
//4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID,
// brand name, and price,
// such that it can internally keep track of how many vehicles have been created so far,
// without requiring manual counting from outside the class.

public class VehicleDemo1 {

    int vehicleId;
    String brandName;
    double price;

    static int count =0;

    VehicleDemo1 (int vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        count++;
    }

    void print() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }


    public static void main(String[] args) {
        VehicleDemo1 v1 = new VehicleDemo1(1, "Honda", 500000.0);
        VehicleDemo1 v2 = new VehicleDemo1(2, "Toyota", 750000.0);
        VehicleDemo1 v3 = new VehicleDemo1(3, "Hyundai", 620000.0);

        v1.print();
        v2.print();
        v3.print();

        System.out.println("Total Vehicles Created: " + VehicleDemo1.count);
        System.out.println();
    }

}