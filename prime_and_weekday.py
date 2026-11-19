// Q6. Prime Number and Weekday Using Switch
import java.util.*;
class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), i;
        boolean prime=n>1;
        for(i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) prime=false;
        System.out.println(prime?"Prime":"Not Prime");
        switch(sc.nextInt()) {
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;
            default:System.out.println("Invalid");
        }
    }
}
