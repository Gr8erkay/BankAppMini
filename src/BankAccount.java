public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this("Emmanuel", "012345", 500, "gr8erkay", "012345");
        System.out.println("Empty constructor called ");
    }

    public BankAccount(String customerName, String accountNumber, double accountBalance, String email, String phoneNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        email = email;
        phoneNumber = phoneNumber;
    }

    public double depositFunds(double funds) {
        accountBalance += funds;
        return accountBalance;
    }
    public double withdrawFunds(double funds) {

        if (funds > accountBalance){
            System.out.println("Insufficient Funds");
        }else {
            accountBalance -= funds;
        }

        return accountBalance;
    }

    public void accountDetails(){
        System.out.println( "Account Name:- " + customerName +
                " Account Number:- " + accountNumber + " Account Balance:- $" +
                accountBalance + " Customer email:- " + email +
                " Customer phone number " + phoneNumber);
    }

}
