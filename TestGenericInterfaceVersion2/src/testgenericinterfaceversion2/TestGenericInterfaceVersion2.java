/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgenericinterfaceversion2;
import java.util.function.Function;
/**
 *
 * @author KELVO FRAYAY
 */
public class TestGenericInterfaceVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Function<Integer,String>str= i->"you entered "+i;
        System.out.println(str.apply(10));
    }
    
}
