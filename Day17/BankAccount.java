//Bank Account ManagementCreate a class called BankAccount with properties like accountNumber, customerName, and balance. Use a LinkedList to store multiple bank account objects. Implement methods to:• Add new bank accounts.• Remove bank accounts by account number.• Search for a bank account by account number and display its details.• Display the details of all bank accounts.

import java.util.*;
class Account{
  int accountNumber;
  String customerName;
  int accountbalance;
  public Account(int accountNumber, String customerName, int accountbalance){
    this.accountNumber=accountNumber;
    this.customerName=customerName;
    this.accountbalance=accountbalance;
  }
  public void display(){
    System.out.println(accountNumber+ " " + customerName+ " " +accountbalance);
  }
}

public class BankAccount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList<Account> accounts = new LinkedList<>();
    System.out.println("Bank Accounts");
    for(int i=0; i<5; i++){
      System.out.println("Enter the account number:");
      int accountnumber = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the customer name");
      String name = sc.nextLine();
      System.out.println("Enter the account balance");
      int accountbalance = sc.nextInt();

        Account a = new Account(accountnumber, name, accountbalance);
      accounts.add(a);
    }
    System.out.println("Accounts in bank");
    for(Account a : accounts){
      a.display();
    }
    System.out.println("Enter the account number to remove");
    int accountnumber = sc.nextInt();
    if(accountnumber>=0 && accountnumber<accounts.size()){
      accounts.remove(accountnumber);
      System.out.println("Account removed");
    }
    else{
      System.out.println("No account removed");
    }
    System.out.println("Enter the account number to search");
    accountnumber=sc.nextInt();
    if(accountnumber>=0 && accountnumber<accounts.size()){
      Account a = accounts.get(accountnumber);
      a.display();
    }
    sc.close();
  }
}