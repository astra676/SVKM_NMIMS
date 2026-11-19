// Q4. Roots of Quadratic Equation
import java.util.*;
class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        double d=b*b-4*a*c;
        if(d>0) System.out.println("Real and Distinct: "+((-b+Math.sqrt(d))/(2*a))+" "+((-b-Math.sqrt(d))/(2*a)));
        else if(d==0) System.out.println("Real and Equal: "+(-b/(2*a)));
        else System.out.println("Imaginary Roots");
    }
}
