package basic_reveison;

import java.io.*;

class Test1 implements Serializable{
    int id;
    String name;

    public Test1(int id,String name ) {
        this.id = id;
        this.name=name;
    }
}
public class DeserializationObjCreate {

    public static void main(String[] args) {
        Test1 t1=new Test1(1,"prachi");
        String file="abc.ser";
        try {
            FileOutputStream file1 = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(file1);
            out.writeObject(t1);
            out.close();
            file1.close();
            System.out.println("Object serialized...");
            System.out.println(t1.hashCode());
        } catch (Exception e) {
            System.out.println(e);
        }
        Test1 t2=null;
        try {
            FileInputStream file2= new FileInputStream(file);
            ObjectInputStream is= new ObjectInputStream(file2);
            t2=(Test1) is.readObject();
            is.close();
            file2.close();
            System.out.println("Object deserialized...");
            System.out.println(t2.hashCode());
            }catch (Exception e) {
                System.out.println(e);
            }
        }

    }

