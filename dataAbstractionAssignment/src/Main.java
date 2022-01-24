import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(12112, new ArrayList<>(), new ArrayList<>(), 0,0,0,"man");
        customer1.deposit(5, new Date(), "SAVING");
        customer1.withdraw(10991, new Date(), "SAVING");
        customer1.withdraw(1,new Date(), "SAVING");
        customer1.withdraw(101,new Date(), "SAVING");
        customer1.deposit(3,new Date(),"SAVING");
        customer1.withdraw(101,new Date(),"CHECKING");
        customer1.deposit(3,new Date(),"CHECKING");


        customer1.displayDeposits();
        customer1.displayWithdraws();

    }

}
