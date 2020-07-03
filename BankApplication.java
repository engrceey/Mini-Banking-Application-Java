import java.util.*;
public class BankingApplication{

}
  class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cusName, String cusId){
      customerName = cusName;
      customerId = cusId;
    }

     void deposit(int amount){
      if(amount != 0){
        balance += amount;
        previousTransaction = amount;
      }
    }

     void witdraw(int amount){
        if(amount != 0){
          balance -= amount;
          previousTransaction = -amount;
        }
      }

    void getLastTransaction(){
      if(previousTransaction > 0){
        System.out.println("You Deposited: "+previousTransaction);
      }else if(previousTransaction < 0){
        System.out.println("You withdrew: "+ Math.abs(previousTransaction));
      }else{
        System.out.println("No Transaction yet");
      }
    }