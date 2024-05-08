import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        int TV,PV;
        float XV,YV;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of total voters");
        TV=sc.nextInt();
        PV= TV*80/100;
        System.out.println("The number of polling voters are " +PV);
        XV = PV*60/100;
        System.out.println("The number of votes received by X is  " +XV);
        YV= PV-XV;
        System.out.println("The number of votes received by Y is  " +YV);
    }
}