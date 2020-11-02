/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Loan {
    // declaring private instance variables
    private long loan_amount;
    private String bank_name;
    private String loan_type;
    private double interest;
    private int timePeriodinyears;
// parameterized constructor
    public Loan(long loan_amount, String bank_name, String loan_type, double interest, int timePeriodinyears) {

        this.loan_amount = loan_amount;
        this.bank_name = bank_name;
        this.loan_type = loan_type;
        this.interest = interest;
        this.timePeriodinyears = timePeriodinyears;
    }
// getter methods for all instance variables
    public long getLoan_amount() {
        return loan_amount;
    }

    public String getBank_name() {
        return bank_name;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public double getInterest() {
        return interest;
    }

    public int getTimePeriodinyears() {
        return timePeriodinyears;
    }
//overriding toString() with Loan instance variables
    @Override
    public String toString() {
        return "Loan Details\n" + "loan_amount=" + getLoan_amount()
                + ",\nbank_name=" + getBank_name() + ",\nloan_type=" + getLoan_type()
                + ",\ninterest=" + getInterest() + ",\ntimePeriodinyears=" + getTimePeriodinyears();
    }

}
