public class CheckingAccount
{
  // instance variables
  private String accountNumber;
  private String accountHolder;
  private int    balance;

  //constructors
  CheckingAccount( String accNumber, String holder, int start )
  {
    accountNumber = accNumber ;
    accountHolder = holder ;
    balance       = start ;
  }

  // methods
  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public int getBalance() {
    return this.balance;
  }

  public void processDeposit ( int amount )
  {

    balance = balance + amount ;
  }

  public void processCheck( int amount )
  {
    int charge;
    if ( balance < 100000 )
      charge = 15; 
    else
      charge = 0;

    balance =  balance - amount - charge  ;
  }

  

  public String toString() {
    return "Account: " + accountNumber + "\tOwner: " + accountHolder + "\tBalance: " + balance ;
  }
} 
