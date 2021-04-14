/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testresetable;

/**
 *
 * @author KELVO FRAYAY
 */
public class TestResetable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create an Oblong object and BankAccount Object
        Oblong testOblong= new Oblong(3,7);
        BankAccount testAccount= new BankAccount("12345678","kelvin");
        
        // Make a deposit into the BankAccount object
        testAccount.deposit(1000);
        
        /* call the resetObject method with a lambda expression that sets
            the length and height of the Oblong to 1 */
         resetObject(()->{
            testOblong.setHeight(1);
            testOblong.setLength(1);
        });
        
        /* call the resetObject method with a lambda expression that sets
            the balance of the BankAccount object to zero. You can't do this
            directly because there is no setBalance method - but you can
            withdraw the total amount that is in the account */
        resetObject(()->{
           testAccount.withdraw(testAccount.getBalance());
        });
        
         /* display the length and height of the oblong (which should now
            be 1) and the balance of the bank account (which should now be
            zero) */
         System.out.println("oblong length is "+testOblong.getLength()+" and height is "+testOblong.getHeight());
         System.out.println("bank account balance is "+testAccount.getBalance());
    }
    // write a resetObject method as follows:

    static void resetObject(Resetable objectIn) {
        objectIn.reset();
    }
}
