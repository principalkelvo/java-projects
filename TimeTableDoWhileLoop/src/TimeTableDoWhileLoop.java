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
public class TimeTableDoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char group,response;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("***Lab Timetable***");
        do{
            System.out.println();//create a blank line
            System.out.println("[1] TIME FOR GROUP A");
            System.out.println("[2] TIME FOR GROUP B");
            System.out.println("[3] TIME FOR GROUP C");
            System.out.println("[4] TIME FOR GROUP D");
            System.out.println("ENTER CHOICE [1,2,3,4]: ");
            response=keyboard.next().charAt(0);//get response
            System.out.println();//create a blank line
            switch(response){
                case '1': System.out.println("10:00 am");
                break;
                case '2': System.out.println("01:00 pm");
                break;
                case '3': System.out.println("04:00 pm");
                break;
                case '4': System.out.println("GoodBye");
                break;
                default:System.out.println("Options 1-4 only!");
            }
        } while (response !='4'); //test for quit option
        // TODO code application logic here
    }
    
}
