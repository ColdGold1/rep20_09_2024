import immutable.challenge.createClass.BankAccount;
import immutable.challenge.createClass.BankCustomer;

import java.util.List;

public class BankMain {

    public static void main(String[] args) {

        BankCustomer joe = new BankCustomer("Joe",500.00,10000.0);
        System.out.println(joe);

        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);

    }

}
