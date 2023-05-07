public class Ritam {
    public static void main(String[] args) {
        System.out.println("Testing.......");
        Sanyal s=new Sanyal();
        s.A=20;
        System.out.printf("%s is %d years old",s.s,s.add());
    }
}
class Sanyal{
    int A;
    String s="Ritam Sanyal";
    int add(){
        A=A+1;
        return A;
    }
}
