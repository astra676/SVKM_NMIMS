// Q2. Division and ASCII Value
import java.util.*;
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        char ch=sc.next().charAt(0);
        System.out.println("Division = "+(a/b));
        System.out.println("ASCII = "+(int)ch);
    }
}
