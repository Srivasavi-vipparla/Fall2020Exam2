/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.time.DayOfWeek;

/**
 *
 * @author Sri Vasavi Vipparla
 */
class EnumExample {

    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Day d = Day.MONDAY;
        if (isWeekday(d)) {
            System.out.println(d + " is weekday");
        } else {
            System.out.println(d + " is Weekend");
        }
    }

    public static boolean isWeekday(Day d) {

        if (DayOfWeek.SATURDAY.equals(d) || DayOfWeek.SUNDAY.equals(d)) {
            return false;
        } else {
            return true;
        }
    }

}
