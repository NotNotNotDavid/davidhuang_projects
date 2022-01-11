import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("man",121211,0,0);
//        customer1.deposit(1, new Date(), "SAVING");
//        System.out.println(customer1.withdraw(10991, new Date(), "SAVING"));


        customer1.displayDeposits();
        customer1.displayWithdraws();
//        System.out.println(customer1.withdraw(100, new Date(), "SAVING"));
//        System.out.println(customer1.checkOverdraft(1000,"SAVING"));
//        customer1.displayDeposits();

    }

}
