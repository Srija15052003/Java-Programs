import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. ");
        float f1 = sc.nextFloat(); 
        System.out.println("Enter 2nd no. ");
        float f2 = sc.nextFloat(); 
        float p = f1*f2;

        System.out.println("Multiplication result is " +p);
    }
    
}
