package NIks;
//overriding wrt variables is not applicable
//Whether variables are static or non static there is no change in output
public class C {
int x=10;

}
class D extends C{
    int x=11;
}
class Main{
    public static void main(String[] args) {
        C c =new C();
        System.out.println(c.x);
        D d = new D();
        System.out.println(d.x);
    }
}