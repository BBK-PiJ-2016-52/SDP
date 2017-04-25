package WorkSheetScalaReflection;

import java.util.Scanner;

/**
 * Created by Eric on 15/04/2017.
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        Reflection launcher = new Reflection();
        launcher.launch();
    }

    /**
     * This method read the user input and evaluate if the Class exist, describe the name and package.
     * @throws ClassNotFoundException
     */
    private void launch () throws ClassNotFoundException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a the class name: ");
        String n = reader.next();
        java.lang.Class.forName(n);// The try and catch is implicit on this line as the trows is implemented on the method.
        System.out.println(n + " " + Class.forName(n).getName() + " " + Class.forName(n).getPackage());

    }
}