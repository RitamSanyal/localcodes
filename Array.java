import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        int []arr = new int[10];
        int i,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements you want:");
        c= sc.nextInt();
        System.out.println("Enter "+c+" elements in the array:");
        try {
            for(i=0;i<c;i++) {
                System.out.print(i+1+". ");
                arr[i] = sc.nextInt();
            }
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("The numbers in array are:");
        for (int j=0;j<c;j++) {
            System.out.println(arr[j]);
        }
    }
}