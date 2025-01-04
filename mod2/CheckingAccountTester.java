

public class CheckingAccountTester
{
  public static void main( String[] args )
  {
    CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100 );

    System.out.println( account1.getBalance() );
    account1.processDeposit( 2000 );
    account1.processCheck( 1500 );
    System.out.println( account1.getBalance() );
        
    System.out.println( account1 );
  }
}