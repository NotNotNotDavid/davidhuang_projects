import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    public Customer(){
        //this is default
    }

    public double getCheckBalance() {
        return checkBalance;
    }


    public Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double deposit(double amt, Date date, String account) {
        this.deposits.add(new Deposit(amt, date, account));
        if(account.equals(CHECKING)){
            checkBalance = checkBalance + amt;
            return checkBalance;
        }
        else if (account.equals(SAVING)){
            savingBalance = savingBalance + amt;
            return savingBalance;
        }
        return checkBalance;
    }

    public double withdraw(double amt, Date date, String account) {

        if(account.equals(CHECKING)){
            if (!checkOverdraft(amt,account)){
                this.withdraws.add(new Withdraw(amt, date, account));
                return checkBalance = checkBalance - amt;
            }
            else return checkBalance;
        }
        else if (account.equals(SAVING)){
            if (!checkOverdraft(amt,account)){
                this.withdraws.add(new Withdraw(amt, date, account));
                return savingBalance = savingBalance - amt;
            }
            else return savingBalance;

        }
        return savingBalance;
    }

    public boolean checkOverdraft(double amt, String account) {
        if(account.equals("CHECKING")){
            return checkBalance - amt < OVERDRAFT;
        }
        else if (account.equals("SAVING")){
            return savingBalance - amt < OVERDRAFT;
        }
        return false;
    }

    //do not modify
    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }

}
