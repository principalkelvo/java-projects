/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetableversion2;

/**
 *
 * @author KELVO FRAYAY
 */
public class TimeTableVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char group; // to store the tutorial group Scanner keyboard = new Scanner(System.in);
        System.out.println("***Lab Times***"); // display header 
        System.out.println("Enter your group (A,B,C)"); 
        group = 'a';
        switch (group) {
            case 'A': case 'a':
                System.out.println("4.00 p.m");
                break;
        // TODO code application logic here
            case 'B': case 'b':
                System.out.println("1.00 p.m");
                break;
            case 'C': case 'c':
                System.out.println("11.00 a.m");
                break;
            default:
                System.out.println("No such group");
                break;
        }
    }
    
}
