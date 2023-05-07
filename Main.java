import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a,b=6;
        /*System.out.println("Hello world!");
        System.out.println(a+b);
        System.out.println(a%b);
        System.out.print("Input a Number:");
        int num=sc.nextInt();
        System.out.println("your number is- "+num);
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());*/
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a age:");
        a=sc.nextInt();
        if (a<0)
            System.out.println("Invalid input");
        else if (a<18) {
            System.out.println("Uneligible to vote");
        } else
            System.out.println("Eligible to vote");

    }
}