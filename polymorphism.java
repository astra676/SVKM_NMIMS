class Shape {
    double area() { return 0; }
}
class Circle extends Shape {
    double area() { return 3.14*5*5; }
}
class Rectangle extends Shape {
    double area() { return 10*20; }
}
class Q16 {
    public static void main(String[] args) {
        Shape s=new Circle(); System.out.println(s.area());
        s=new Rectangle(); System.out.println(s.area());
    }
}