package pal.paragi;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setNumber("2222");
        account.setBalance(300000);
        account.setCustomerName("Paragi Pál");
        account.setCustomerEmail("pal.paragi@gmail.com");
        account.setCustomerPhone("+36706040200");

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerEmail());
        System.out.println(account.getCustomerPhone());

        account.deposit(1000);
        account.withdrawal(301001);

    }





}
