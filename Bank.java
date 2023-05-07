public class Bank {
    void name(){
        System.out.println("NULL");
    }
}
class SBI extends Bank{
    void name() {
        System.out.println("SBI");
    }
}
class ICICI extends Bank{
    void name() {
        System.out.println("ICICI");
//        super.name();
    }
}
class RUNBANK{
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
//        Bank b=new Bank();
        s.name();
        i.name();

    }
}
