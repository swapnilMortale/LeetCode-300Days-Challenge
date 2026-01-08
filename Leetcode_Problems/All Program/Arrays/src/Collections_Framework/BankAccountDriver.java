package Collections_Framework;


import java.util.ArrayList;
import java.util.Collections;

public class BankAccountDriver
{
    public static void main(String[] args)
    {
        ArrayList<BankAccount> accounts = new ArrayList<>() ;
        accounts.add(new BankAccount("John Doe", "ACC001", 5000.0, "Savings"));
        accounts.add(new BankAccount("Alice Smith", "ACC002", 10000.0, "Current"));
        accounts.add(new BankAccount("Bob Johnson", "ACC003", 2500.0, "Savings"));
        accounts.add(new BankAccount("Emma Wilson", "ACC004", 15000.0, "Fixed"));

        for (BankAccount bankAccount : accounts)
        {
            System.out.println(bankAccount);
        }
        
    }
}
