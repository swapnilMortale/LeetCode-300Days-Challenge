package Collections_Framework;

public class BankAccount
{
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(String accountHolder, String accountNumber, double balance, String accountType)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount)
    {
        if (amount > 0 )
        {
            balance += amount ;
            System.out.println("Successfully deposited: $" + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void Withdraw(double amount)
    {
        if (amount > 0)
        {
            balance -= amount ;
            System.out.println("Successfully withdrawn: $" + amount);
        }
        else
        {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public  void  checkBalance()
    {
        System.out.println("Account Balance: $" + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String toString()
    {
        return "["+accountHolder+","+accountNumber+","+accountType+","+balance+"]";
    }
}
