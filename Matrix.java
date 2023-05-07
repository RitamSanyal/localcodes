import java.util.Scanner;

public class Matrix {
    public static void main(String[]args){
//        int [][]mat=new int[10][10];
        int i,j,row,clo;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        row= sc.nextInt();
        System.out.print("Enter number of columns:");
        clo= sc.nextInt();
        int [][]mat=new int[row][clo];
        System.out.println(mat.length);
        System.out.println(mat[1].length);
        /*System.out.println("Enter the numbers in the matrix:");
        for (i=0;i<row;i++)
        {
            for (j=0;j<clo;j++)
            {
                System.out.print(i+1+"x"+(j+1)+". ");
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.print("The matrix is->\t");
        for (i=0;i<row;i++)
        {
            for (j=0;j<clo;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.print("\n \t \t \t \t");
        }*/
    }
}
