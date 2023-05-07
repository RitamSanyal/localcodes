import java.util.Scanner;

public class daynumber {
    
    public static void main(String[]args){
        int daynum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number(1-7):");
        daynum=sc.nextInt();
        switch (daynum)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("\t \n Invalid input,only 1-7 is allowed\n");
        }
    }
}
