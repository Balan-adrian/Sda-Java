package fundamentals.oop;

import com.sun.javafx.geom.Curve;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());

        Client client = new Client("Larisa", "20457839021561", bankAccount);
        System.out.println(client);

        client.getBankAccount().addMoney(12);
        client.getBankAccount().withDrawMoney(13);
        System.out.println(client.toString());
        client.getBankAccount().setType("SPENDING");
        client.getBankAccount().addMoney(1);
        client.getBankAccount().withDrawMoney(2);

        BankAccount.convertMoney(10, "EUR", "USD");
        System.out.println(BankAccount.convertMoney(10, "EUR", "USD"));

        double x = BankAccount.convertMoney(10, "EUR", "USD");
        System.out.println(BankAccount.convertMoney(10, "EUR", "USD"));
        System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD");
        BankAccount[] myArray = {bankAccount1, bankAccount2};
        client.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        BankAccount[] clientBankAccounts = client.getBankAccounts();
        System.out.println(clientBankAccounts[0]);
        System.out.println(client.getBankAccounts()[0]);

//        System.out.println("Input client' s name: ");
//        String name = scanner.next();
//        System.out.println("Imput client' s cnp: ");
//        String cnp = scanner.next();
//
//        Client client1 = new Client(name, cnp);
//        System.out.println(client1);

    }

}
