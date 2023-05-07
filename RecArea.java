import java.util.Scanner;

class Rectangle {
    int Length; int Width;
    public int area () {
//        System.out.println("Area is "+Length*Width); //Method 1 NOTE: Change return type to void in public int area()->public void area()
        return Length*Width; //Method 2
    }

    public int perimeter() {
//        System.out.println("Perimeter is "+2*(Length+Width)); //Method 1 NOTE: NOTE: Change return type to void in public int perimeter()->public void perimeter()
        return 2*(Length+Width); //Method 2
    }
}
public class RecArea {
    public static void main(String[] args){

        Rectangle rc = new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle : ");
        rc.Length= sc.nextInt();
        System.out.print("Enter the Width of Rectangle : ");
        rc.Width = sc.nextInt();
        /*rc.area();
        rc.perimeter();*/ //Method 1
        System.out.println("Area is "+rc.area());
        System.out.println("Perimeter is "+rc.perimeter()); //Method 2
    }
}