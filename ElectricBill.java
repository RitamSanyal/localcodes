import java.util.*;
public class ElectricBill{
  String n;
  int units;
  double bill;
  void accept(){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a name: ");
    n=sc.nextLine();
    System.out.print("Enter the unit: ");
    units=sc.nextInt();
  }
  void calculate (){
    if(units<=100){
      bill=2.00*units;
    }
    else if(units<=300){
      bill=200+(3*(units-100));
    }
    else {
      int temp=200+600+(5*(units-300));
      bill=temp+((temp*2.5)/100);
//      System.out.println("Temp: "+temp);
    }
  }
  void print (){
    System.out.println("Name of the customer: "+n);
    System.out.println("Number of Units: "+units);
    System.out.println("Bill amount: "+bill);
  }

  public static void main(String[] args) {
    ElectricBill eb = new ElectricBill();
    eb.accept();
    eb.calculate();
    eb.print();
  }
}