/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Array {
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        //Creating new ArrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            //Checking the newList contains the element in list
            if (newList.contains(list.get(i))) {
                //if condition is true continue i.e increment i
                continue;
            } else {
                //add element to newList and increment i
                newList.add(list.get(i));
            }            
        }
        System.out.print("The distinct integers are ");
        //printing elemets in newList
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
    
}
