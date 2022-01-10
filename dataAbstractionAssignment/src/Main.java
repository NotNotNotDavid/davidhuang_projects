import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Deposit deposit1 = new Deposit(10,new Date(),"SAVING");
//        System.out.println(deposit1);

        Customer customer1 = new Customer("man",121211,10,10);
//        customer1.deposit(10, new Date(), "SAVING");
//        customer1.withdraw(20, new Date(), "SAVING");

//        System.out.println(customer1.displayDeposits());
        customer1.displayDeposits();
        customer1.displayWithdraws();
        System.out.println(customer1.checkOverdraft(1000,"SAVING"));
    }

}
