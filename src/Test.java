
//method overloading
public class Test {
    public void method1(StringBuffer sb) {

        System.out.println("String Buffer Argument");
    }
public void method1(String s){
    System.out.println("String Version");
    }




   public void m1(Object o){
       System.out.println("Object clss version");
   }
   public void m1(String s){
       System.out.println("String version");
   }

//we cannot overload static , private methods
  /*  private static void m3(Object o){
        System.out.println("Object clss version");
    }
    private static void m3(String s){
        System.out.println("String version");
    }
*/

    public static void main(String[] args) {
Test t =new Test();
//More specific version get more priority here StringBuffer has
t.method1(new StringBuffer("niks"));
t.method1( "vicks");
//if i am going to add null in method 1 object then there is ambiguity.
 //   t.method1(null);

        //child arguments get more priority than parent argument
    t.m1(new Object());
    t.m1("nikhil");//objejct version
    t.m1(null);//valid string
    t.m1(105);

//t.m3(105);
//t.m3(vicks);
    }
}