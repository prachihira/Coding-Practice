package basic_reveison;

public class Overriding {
    public static void main(String[] args) {
A a= new A();
a.methodOne();
A a1=new B();
a1.methodOne();
B b = new B();
b.methodOne();
    }
}
    class  A{
        public void methodOne() {
            System.out.println("inside overridden method");
        }
    }
class  B extends A {
    public final void methodOne() {
        System.out.println("inside overriding method");
    }

}


