package basic_reveison;

public class MethodOverloadingAmbiguity {
    public static void main(String[] args) {
        TestAmbihuity t=new TestAmbihuity();
        t.methodOne("prachi");
        t.methodOne("hira");
        //t.methodOne(null);
        //t.methodOne(10.5);
    }
}

class  TestAmbihuity{
    public void methodOne(String s){
        System.out.println("stringtype arg method");
    }
    public void methodOne(StringBuffer sb){
        System.out.println("StringBuffertype arg method");
    }
}
