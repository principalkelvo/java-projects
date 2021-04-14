/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringdemo;

/**
 *
 * @author KELVO FRAYAY
 */
public class ToStringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount acc= new BankAccount("123G","Kelvo Njosh");
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println(acc);
    }
    
}
