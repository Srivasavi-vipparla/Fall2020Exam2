/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Inheritance;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Teacher extends Person {

    private String subject, college_name, prefix;
    private long salary;

    public Teacher(String subject, String college_name, long salary, String prefix, String fName, String lName, int age) {
        super(fName, lName, age);
        this.subject = subject;
        this.college_name = college_name;
        this.salary = salary;
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

}
