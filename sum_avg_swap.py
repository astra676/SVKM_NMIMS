// Q3. Sum, Average and Swapping
import java.util.*;
class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), c=Integer.parseInt(args[2]);
        System.out.println("Sum = "+(a+b+c)+" Average = "+(a+b+c)/3.0);
        int x=sc.nextInt(), y=sc.nextInt();
        System.out.println("Original: "+x+" "+y);
        int t=x; x=y; y=t;
        System.out.println("Swapped: "+x+" "+y);
    }
}
