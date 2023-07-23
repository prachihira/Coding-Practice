package basic_reveison;
//creating object through cloning
public class CloneExample implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    String name = "Roni";
    int id = 51;

    public static void main(String[] args) {
        CloneExample c1=new CloneExample();
        System.out.println(c1.hashCode());
        try {
            CloneExample c2=(CloneExample) c1.clone();
            System.out.println(c2.hashCode());
            System.out.println(c2.id);
            System.out.println(c2.name);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
