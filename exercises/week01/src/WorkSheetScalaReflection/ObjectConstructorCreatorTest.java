package WorkSheetScalaReflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Eric on 26/04/2017.
 */
public class ObjectConstructorCreatorTest extends ObjectConstructorCreator {

    Class cls = Class.forName("java.lang.String");

    public ObjectConstructorCreatorTest() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ObjectConstructorCreator launcher = new ObjectConstructorCreator();
        launcher.launch();
    }

    @org.junit.Test
    public void launch() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor[] constructors = cls.getConstructors();
        cls.getConstructor(String.class);
        Constructor<Object> constructor = null;
        Class[] parameterTypes = constructor.getParameterTypes();
        constructor.newInstance("String");
    }

}