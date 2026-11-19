class Person {
    String name="Rahul";
    void displayDetails() { System.out.println(name); }
}
class Employee extends Person {
    int id=101;
    void displayDetails() { super.displayDetails(); System.out.println(id); }
}
class Manager extends Employee {
    String department="IT";
    void displayDetails() { super.displayDetails(); System.out.println(department); }
}
class Q17 {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.displayDetails();
    }
}