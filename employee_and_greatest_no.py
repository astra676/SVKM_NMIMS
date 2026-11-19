// Q5. Employee Details and Greatest of Three Numbers
import java.util.*;
class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Enter name, salary, age:");
            String n=sc.next(); double s=sc.nextDouble(); int a=sc.nextInt();
            System.out.println(n+" "+s+" "+a);
        }
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        System.out.println("Greatest = "+Math.max(a,Math.max(b,c)));
    }
}
