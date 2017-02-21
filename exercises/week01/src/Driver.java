/**
 * Created by erodri07 on 10/01/2017.
 */
public class Driver {

    public static void main(String[] args) {
        Driver launcher = new Driver();
        launcher.launch();
    }

    private void launch() {
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
            System.out.println( "EQUAL" );
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
