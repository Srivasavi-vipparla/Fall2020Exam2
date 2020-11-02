/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class TwoDArray {

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                //comparing elemets in both arrays
                if (m1[i][j] == m2[i][j]) {
                    //if matches the lements continue to check next element
                    continue;
                } else {
                    // returning false
                    return false;
                }

            }
        }
        return true;
    }

}
