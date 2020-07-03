import java.util.*;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Account Name: ");
    String accountName = scanner.nextLine();

    System.out.print("Enter Account Number: ");
    String accountNumber = scanner.nextLine();

    BankAccount obj1 = new BankAccount(accountName, accountNumber);
    obj1.bankMenu();

  }
}
// #JustJavaIt...
