/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.runtime;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Person {
    private String fName,lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPersonDetails(){
        return getfName()+" "+getlName();
        
    }

    @Override
    public String toString() {
        return "Person{" + "fName=" + fName + ", lName=" + lName + ", age=" + age + '}';
    }
    
    
}
