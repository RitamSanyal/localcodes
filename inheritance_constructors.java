class Base{
    Base(int b1,int b2){
        System.out.print("This is Base : ");
        System.out.println(b1-b2);
    }

    Base() {}
}
class Derived extends Base{
    Derived(int d1,int d2){
//        super(d1,d2);
        System.out.print("This is derived : ");
        System.out.println(d1+d2);
    }
}
public class inheritance_constructors {
    public static void main(String[] args) {
        int n1=12,n2=10;
        Base b=new Base(n1,n2);
        Derived d=new Derived(n1,n2);
    }
}
