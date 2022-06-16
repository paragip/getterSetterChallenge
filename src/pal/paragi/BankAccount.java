package pal.paragi;

public class BankAccount {

    private String number;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double amountOfDeposit) {
        this.balance += amountOfDeposit;
        System.out.println("amount of deposit = " + amountOfDeposit + " HUF and new balance = " + this.balance + " HUF");
    }

    public void withdrawal(double amountOfWithdrawal) {
        if (amountOfWithdrawal <= this.balance) {
            this.balance -= amountOfWithdrawal;
            System.out.println("amount of withdrawal = " + amountOfWithdrawal + " HUF and new balance = " + this.balance + " HUF");
        } else {
            System.out.println("balance is not enough, error");
        }
    }


}
