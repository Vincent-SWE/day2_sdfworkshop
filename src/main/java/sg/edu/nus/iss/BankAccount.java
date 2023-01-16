package sg.edu.nus.iss;

import java.sql.Date;

public class BankAccount {
    

    // all attributes use 'private' and should only be exposed via getters and setters
    private final String AccountNo;
    private String fullName;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;


    // Getters and Setters
    // Notice that there is no setter for getAccountNo generated because it is declared 'final' above
    public String getAccountNo() {
        return AccountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    
    public BankAccount(String accountNo, double balance) {
        AccountNo = accountNo;
        this.balance = balance;
    }


    
    


}
