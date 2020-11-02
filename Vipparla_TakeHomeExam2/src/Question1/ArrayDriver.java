/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating scanner object
        Scanner s = new Scanner(System.in);
        //creating myArray list
        ArrayList<Integer> myArray = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        //reading values to myArray
        for (int i = 0; i < 10; i++) {
            int a = s.nextInt();
            myArray.add(a);
        }
       //calling removeDuplicate(ArrayList<Integer>)
        Array.removeDuplicate(myArray);
        System.out.println();

    }

}
