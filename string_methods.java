import java.util.*;
class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.length()+" "+s.charAt(0)+" "+s.substring(1)+" "+s.indexOf('a')+" "+s.replace('a','b'));
        for(int i=0;i<s.length();i++)
            if(s.indexOf(s.charAt(i))==i)
                System.out.println(s.charAt(i)+" = "+s.length()-(s.replace(String.valueOf(s.charAt(i)),"").length()));
    }
}