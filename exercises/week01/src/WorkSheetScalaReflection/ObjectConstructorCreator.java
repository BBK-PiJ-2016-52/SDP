package WorkSheetScalaReflection;

/**
 * Created by Eric on 15/04/2017.
 */
public class ObjectConstructorCreator {

    public static void main(String[] args) throws ClassNotFoundException {
        ObjectConstructorCreator launcher = new ObjectConstructorCreator();
        launcher.launch();
    }

    private void launch () throws ClassNotFoundException {
        try {
            Class cls = Class.forName("java.lang.String");
            //java.lang.reflect.Constructor.newInstance().
            System.out.println("Class found = " + cls.getName());
            System.out.println("Package = " + cls.getPackage());
        } catch(ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
}