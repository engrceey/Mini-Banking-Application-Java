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