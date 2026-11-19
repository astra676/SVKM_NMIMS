import java.util.*;
class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), r=new StringBuilder(s).reverse().toString();
        System.out.println("Reverse = "+r);
        System.out.println(s.equalsIgnoreCase(r)?"Palindrome":"Not Palindrome");
    }
}