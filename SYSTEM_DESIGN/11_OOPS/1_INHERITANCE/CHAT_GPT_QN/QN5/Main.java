package QN5;
// Q5. Bank and Accounts
// A bank has different types of accounts.
// Create a base class Account with fields: accountNo, balance and methods deposit() and withdraw().
// Derive a class SavingAccount with an additional field interestRate.
// Derive a class FixedDeposit with timePeriod and a method calculateMaturityAmount().
// Write a program to create accounts and display details.



class Account {
  int accountNo;
  int balance;


  Account(int accountNo, int balance) {
    this.accountNo = accountNo;
    this.balance = balance;
  }

  void deposite(double amount) {
      balance += amount;
      System.out.println("The amount : " + amount + "balance: " + balance);
  }


  void withdraw(double amount) {
    if(amount <= balance) {
      balance -= amount;
    }

    System.out.println("amount: " + amount + "balance " + balance);

  }

  void display() {
    System.out.println("AccountNo: " + accountNo + "balance: " + balance);
  }
}



class SavingAccount extends Account {
    int interestRate;

    SavingAccount(int accountNo, int balance, int interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
      double interest = balance * interestRate / 100;

      balance += interest;

      System.out.println("interest: " + interest + "balance: " + balance);
    }


    void display() {
      super.display();
      System.out.println("The interest is: " + interestRate + "%");
    }

}



class FixedDeposit extends Account{
    int timePeriod;

    FixedDeposit(int accountNo, int balance, int interestRate, int timePeriod) {
         super(accountNo, balance);
         this.interestRate = interestRate;


    }
}


public class Main {
  public static void main(String[] args) {
    
  }
}



