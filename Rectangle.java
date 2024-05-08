import java.util.*;
class Rectangle {
    int l,b,ar;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        l=in.nextInt();
        System.out.println("Enter the breadth");
        b=in.nextInt();
    }
    public void calculate(){
        ar=l*b;
    }
    public void display(){
        System.out.println("Length is "+l);
         System.out.println("Breadth is "+b);
          System.out.println("Area is "+ar);
    }
    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.input();
        ob.calculate();
        ob.display();
        }
}