package basic_reveison;

public class MethodOverloading {
    public static void main(String[] args) {
        Test t=new Test();
        t.methodOne('a');
        t.methodOne(10);
        t.methodOne(10.5f);
        //t.methodOne(10.5);
    }
}

class  Test{
    public void methodOne(int i){
        System.out.println("int arg method");
    }
    public void methodOne(float f){
        System.out.println("float arg method");
    }
}
