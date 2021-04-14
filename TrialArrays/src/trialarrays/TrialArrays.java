/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trialarrays;
import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class TrialArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]javaStudents;
        javaStudents = new int[3];
        enterExamMarks(javaStudents);
        increaseMarks(javaStudents);
        allHavepassed(javaStudents);
    }
    static void enterExamMarks(int[]javaStudentsIn){
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<javaStudentsIn.length;i++){
            System.out.println("enter students marks: ");
            javaStudentsIn[i]= keyboard.nextInt();
        }
    }
    static void increaseMarks(int[]javaStudentsIn){
        int increase=5;
        for(int i=0;i<javaStudentsIn.length;i++){
                System.out.println("marks="+(increase+javaStudentsIn[i]));
            }     
    }
    static void allHavepassed(int []javaStudentsIn){
        for(int item:javaStudentsIn){
            if(item<40){
                System.out.println("you have passed");
            }
        }
    }
}
