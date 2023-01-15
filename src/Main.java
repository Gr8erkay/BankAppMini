public class Main {

    public static void main(String[] args) {
    BankAccount account001 = new BankAccount();
    BankAccount account002 = new BankAccount("Tim", "0123", 30.09, "tim@gmail", "3456");

    account001.setCustomerName("Emmanuel Omokayode");
    account001.setAccountNumber("0083356806");
    account001.setAccountBalance(5000);
    account001.setEmail("gr8erkay@gmail.com");
    account001.setPhoneNumber("08174290490");


        System.out.println(account001.depositFunds(2500));
        account001.accountDetails();
        account002.accountDetails();


    }
}
