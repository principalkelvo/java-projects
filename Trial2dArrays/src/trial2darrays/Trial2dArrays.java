/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial2darrays;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class Trial2dArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Magic Square
        //initialize square
        char [][]magicSquare= new char [4][4];
        enterMagicWords(magicSquare);
        /*{
                                {'P','R','E','Y'},
                                {'L','A','V','A'},
                                {'O','V','E','R'},
                                {'T','E','N','D'}
                              };*/
        
        displayRow(magicSquare);
        displayColumn(magicSquare);
        //display magic square words
        
        
    }
    
    static void enterMagicWords(char [][] magicSquareIn){
        Scanner keyboard = new Scanner (System.in);
        //the outer loop controls the row
        for(int i=0;i<magicSquareIn.length;i++){
            //the inner loop controls the column
            for(int j=0;j<magicSquareIn[i].length;j++){
                System.out.println("enter values to fill in the triangle: ");
                magicSquareIn[i][j]=keyboard.next().charAt(0);
            }
        }
    }
    //display row words
    static void displayRow(char [][] magicSquareIn){
        for(int row=0;row<magicSquareIn.length;row++){
            for(int col=0;col<magicSquareIn[row].length;col++){
                System.out.print(magicSquareIn[col][row]);
            }
            
            System.out.println();
            
        }
    }
    
    //display row words
    static void displayColumn(char [][] magicSquareIn){
    for(int row=0;row<magicSquareIn.length;row++){
            for(int col=0;col<magicSquareIn[row].length;col++){
                System.out.print(magicSquareIn[row][col]);
            }
            
            System.out.println();
            
        }
    }
}
