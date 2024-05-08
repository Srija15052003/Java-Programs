import java.util.Scanner;
public class Payment_Customer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float PP, Dis, Rem_Amt, GST, Amount;
        System.out.println("Enter the print price ");
        PP=sc.nextFloat();
        Dis=PP*10/100;
        Rem_Amt=PP-Dis;
        GST=Rem_Amt*9/100;
        Amount=Rem_Amt+GST;
        System.out.println("Amount to be paid by the customer is " +Amount);
    }
}