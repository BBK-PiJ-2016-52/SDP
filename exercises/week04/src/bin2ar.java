/**
 * Created by Eric on 09/02/2017.
 */
public class bin2ar {

    public static void main(String[] args) {

        System.out.println("Type the base (b) and exponent (e): ");
        System.out.println("b: ");
        String str1 = System.console().readLine();
        int b = Integer.parseInt(str1);
        System.out.println("e: ");
        String str2 = System.console().readLine();
        int e = Integer.parseInt(str2);

        System.out.println( b + " pow " + e + " is: "  + Math.pow(b,e));
        System.out.println("2 power of " + e + " is: " + Math.pow(2,e));

        System.out.println("Now enter a binary number: ");
        String str3 = System.console().readLine();
        char[] stringToCharArray = str3.toCharArray();

        for(int i = 0; i <= str3.length(); i++){
            if (stringToCharArray[i] == 1) {
                System.out.println("Times Im doing it");
            }

        }
    }
}
