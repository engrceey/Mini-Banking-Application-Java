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

    switch(option.toUpperCase()){

  case "A":
  System.out.println("-------------------------------------");
  if(balance < 0){
    System.out.println(customerName+", You Owe "+Math.abs(balance));
    }else{
    System.out.println("Your Balance: "+balance);
  }  
  System.out.println("-------------------------------------");
  System.out.println();
  break;

  case "B":
  System.out.println("-------------------------------------");
  System.out.print("Enter amount to deposit: ");
  int amount = scanner.nextInt();
  deposit(amount);
  System.out.println();
  System.out.println("-------------------------------------");
  System.out.println(amount +" Deposited Successfully");
  System.out.println("-------------------------------------");
  System.out.println();
  break;

  case "C":
  System.out.println("-------------------------------------");
  System.out.print("Enter amount to withdraw: ");
  int amount2 = scanner.nextInt();
  witdraw(amount2);
  System.out.println();
  System.out.println("-------------------------------------");
  System.out.println(amount2 +" has been Debited from your account");
  System.out.println("-------------------------------------");
  break;

    case "D":
    System.out.println("-------------------------------------");
    if(previousTransaction < 0){
    System.out.println(customerName+", You Withdraw "+Math.abs(previousTransaction));
    }else{
    System.out.println(customerName+", You Deposited "+previousTransaction);
    } 
    System.out.println("-------------------------------------");
    System.out.println();
    break;

default:
System.out.println("Invalid Option!!, please enter correct option");
break;
}

System.out.println("=====================================");
  System.out.println("PERFORM ANOTHER TRANSACTION ? or E to Exit\nA: Know your Account balance\nB: Deposit funds\nC: Withdraw funds\nD: See last Transaction\nE: Exit");
  System.out.print("What will you like to do?: ");
  option = scanner.next();
  
}while(!option.toUpperCase().equals("E"));

System.out.println();
System.out.println("==========================================================");
System.out.println("Goodbye!, Thank you for Banking with us...");
System.out.println("==========================================================");
}
}

// #JustJavaIt...