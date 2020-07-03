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

    void bankMenu(){
  
  System.out.println(customerName + ", welcome to Zurum Bank International");
  System.out.println("Account Number: "+customerId);
  System.out.println();

  System.out.println("=====================================");
  System.out.println("SELECT AN OPTION BELOW\nA: Know your Account balance\nB: Deposit funds\nC: Withdraw funds\nD: See last Transaction");
  System.out.println();
  System.out.print("What will you like to do?: ");
  
  Scanner scanner =new Scanner(System.in);
  String option;
  option = scanner.next();

  do{


}
