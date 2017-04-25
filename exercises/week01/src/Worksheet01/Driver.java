package Worksheet01;

/**
 * Created by erodri07 on 10/01/2017.
 */
public class Driver {

    public static void main(String[] args) {
        Driver launcher = new Driver();
        launcher.launch();
    }

    private void launch() {

        // Generics are used to introduce two different types into a function

        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        Class baCls = BankAccount.class;
        try {
            BankAccount myAccount =  (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);
            myAccount.deposit(15);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" + "We obtain the number 115 because this is now the new balance on the account." +
                    " The initial balance was 100 held by the BankAccount object. When this object is called by\n" +
                    "the main method of the Driver class we then added 15 to the current balance.\n" +
                    "That is the mechanics of the code — generics enables addition compile time constraints\n" +
                    "to be applied to the types but, of course, this does not apply to runtime.\n");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}