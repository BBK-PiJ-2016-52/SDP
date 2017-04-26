package WorkSheetScalaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Eric on 15/04/2017.
 */
public class ObjectConstructorCreator {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ObjectConstructorCreator launcher = new ObjectConstructorCreator();
        launcher.launch();
    }

    void launch() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            Class cls = Class.forName("java.lang.String");
            System.out.println("Class found = " + cls.getName());
            System.out.println("Package = " + cls.getPackage());
            System.out.println("Constructors = " + cls.getConstructors());
            Constructor[] constructors = cls.getConstructors();
            cls.getConstructor(String.class);
            Constructor<Object> constructor = null;
            Class[] parameterTypes = constructor.getParameterTypes();
            constructor.newInstance("String");

        } catch(ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ex) {
            ex.printStackTrace();
        }
    }
}