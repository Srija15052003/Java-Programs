import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary ");
        a=sc.nextInt();
        float mf,mr,mm,ms;
        mf=(float)a*1/2;
        System.out.println("Money spent on food is " +mf);
        mr=(float)a*1/15;
        System.out.println("Money spent on rent is " +mr);
        mm=(float)a*1/10;
        System.out.println("Money spent on miscellaneous is " +mm);
        ms=(float)a-(mf+mr+mm);
        System.out.println("Money saved is " +ms);
        }
}