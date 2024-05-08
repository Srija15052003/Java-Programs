 import java.util.Scanner;
 class GetInputFromUser {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Entered String is " +s);
        int a = in.nextInt();
        System.out.println("Entered Integer is " +a);
        float b = in.nextFloat();
        System.out.println("Entered Float is " +b);
     }
    
}
