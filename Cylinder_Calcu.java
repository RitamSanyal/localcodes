import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    /*public int getRadius() {
        return radius;
    }*/

    /*public void setRadius(int radius) {
        this.radius = radius;
    }*/

    /*public int getHeight() {
        return height;
    }*/

    /*public void setHeight(int height) {
        this.height = height;
    }*/
    public double surfArea(){
        return 2*3.1416*radius*radius+2*3.142*radius*height;
    }
    public double vol(){
        return 3.1416*radius*radius*height;
    }
}
public class Cylinder_Calcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,r;
        System.out.print("Enter height of the cylinder : ");
        h= sc.nextInt();
        System.out.print("Enter radius of the cylinder : ");
        r= sc.nextInt();
        Cylinder cyl=new Cylinder(r,h);
        /*cyl.setHeight(h);
        cyl.setRadius(r);*/
        System.out.println("The surface area of the cylinder is : "+cyl.surfArea());
        System.out.println("The volume of the cylinder is : "+cyl.vol());
    }
}
