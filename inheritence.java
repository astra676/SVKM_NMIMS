class Vehicle {
    String make="Toyota", model="Fortuner";
    void displayInfo() { System.out.println(make+" "+model); }
}
class Car extends Vehicle {
    String fuelType="Diesel";
    void displayInfo() { super.displayInfo(); System.out.println(fuelType); }
}
class Q15 {
    public static void main(String[] args) {
        Car c=new Car();
        c.displayInfo();
    }
}