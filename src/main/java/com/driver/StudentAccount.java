package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) throws Exception {
        //minimum balance is 0 by defaul
        super(name,balance,5000);
        this.institutionName=institutionName;
    }
    public String getInstitutionName() {
        return institutionName;
    }

}
