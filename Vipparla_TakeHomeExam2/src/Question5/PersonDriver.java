/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating and initializing Person object
        Person p = new Person("Sri", "1115 N Collage Drive", "1111111111", "sri@gmail.com");
        //printing toString() using Person object reference
        System.out.println(p.toString());
        //creating and initializing STudent object
        Student student = new Student('A', "Vasavi", "1121 Maryville", "2222222222", "vasavi@gmail.com");
        //printing toString() using Staff Student reference
        System.out.println(student.toString());
        //creating and initializing Employee object
        Employee emp = new Employee("Apple", 15000, "10/30/2020", "Teja", "12148 Joyville Road,Austin", "3333333333", "teja@gmail.com");
        //printing toString() using Employee object reference
        System.out.println(emp.toString());
        //creating and initializing Faculty object
        Faculty faculty = new Faculty(10, 4, "NWMSU", 16000, "10/30/2019", "Madhavi", "1212 North College Drive,Maryville", "4444444444", "madhavi@gmail.com");
        //printing toString() using Faculty object reference
        System.out.println(faculty.toString());
        //creating and initializing Staff object
        Staff staff = new Staff("Associate Professor", "NWMSU", 13000, "10/30/2018", "Gopi", "1223 North College Drive", "5555555555", "gopi@gmail.com");
        //printing toString() using Staff object reference
        System.out.println(staff.toString());

    }

}
