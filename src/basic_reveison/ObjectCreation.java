package basic_reveison;

public class ObjectCreation {
    //String name="Prachi";
    String name;
    public ObjectCreation() {
        name="Prachi";
    }
    public static void main(String[] args) {
        //object creation using new Keyword
        //ObjectCreation obj = new ObjectCreation();
        //System.out.println(obj);
        try {
            //object creation using newInstance() method of Class type
            ObjectCreation obj= (ObjectCreation)Class.forName("ObjectCreation").newInstance();
            //ObjectCreation obj=(ObjectCreation) c.newInstance();
            System.out.println(obj.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
