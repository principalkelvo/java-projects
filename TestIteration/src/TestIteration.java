import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KELVO FRAYAY
 */
public class TestIteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, square; 
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Enter a number "); 
        num = keyboard.nextDouble(); 
        System.out.print("Enter the square of this number "); 
        square = keyboard.nextDouble(); // loop to check answer 
        while (square!=(num*num))  
        { 
        System.out.println("Wrong answer, try again");
        square = keyboard.nextDouble(); 
    } 
        System.out.println("Well done, right answer");
        }
        // TODO code application logic here
    }
   