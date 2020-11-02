/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class TwoDArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating Scanner object
        Scanner s = new Scanner(System.in);
        //declaring and initializing m1 and m2 arraya
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        System.out.print("Enter list1: ");
        //reading m1 array
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                
                m1[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        //reading m2 array
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = s.nextInt();
            }
        }
        //calling method equals(int[][] m1,int[][]m2) to check arrays are euql or not
        if (TwoDArray.equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

}
