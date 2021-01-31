package fundamentals.oop;

import java.util.Scanner;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized
 * with 0 in the constructor) fields: type of the account (SAVING or SPENDING),
 * balance ( the amount of money), currency ( USD, EUR), methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */

public class BankAccount {
    /**
     * Type of the account: SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency: USD or EUR
     */
    private String currency;

    public static final double USD_TO_EUR = 0.85;
    public static final double EUR_TO_USD = 1.15;

    public BankAccount(String type, String currency) {
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    public void addMoney(double newMoney) {
        if (this.type == "SPENDING") {
            if (newMoney <= this.balance / 10) {
                System.out.println("Please add at least 10% of actualbalance");
            } else {
                this.balance += newMoney;
            }
            return;
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void addMoney1(double newMoney) {
        if (this.type == "SPENDING" && newMoney <= this.balance / 10) {
            if (newMoney <= this.balance / 10) {
                System.out.println("Please add at least 10% of actualbalance");
                return;
            }
            this.balance += newMoney;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

    public void withDrawMoney(double newMoney) {
        if (this.type == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your balance can' t be negative!");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    public static double convertMoney(double amountMoney, String inputCurrency, String outputCurrenty){
      if (inputCurrency.equals("EUR") && outputCurrenty.equals("USD")) {
          return amountMoney * EUR_TO_USD;
      }
      return amountMoney * USD_TO_EUR;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
