import java.util.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) { super(s); }
}
class Q23 {
    static void checkAge(int age) throws InvalidAgeException {
        if(age<18) throw new InvalidAgeException("Not Eligible");
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try { checkAge(sc.nextInt()); }
        catch(InvalidAgeException e) { System.out.println(e.getMessage()); }
    }
}