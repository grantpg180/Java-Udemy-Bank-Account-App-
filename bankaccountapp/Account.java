package bankaccountapp;

public abstract class Account implements IBaseRate{
    //List common properties for savings and checking accounts
    //everything that's shared into checking and savings
    private String name;
    private String sSn;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    //Constuctor to set base properties and initialize the account
    public Account(String name, String sSn, double initDeposit) {
      this.name = name;
      this.sSn=sSn;
      balance = initDeposit;
    
    //Set account number
        this.accountNumber = setAccountNumber();
           // System.out.println("ACCOUNT NUMBER: "+this.accountNumber);
        
        setRate();
        }
    
    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("ACCRUED INTEREST: $"+accruedInterest);
        printBalance();
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSn.substring(sSn.length()-2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10, 3));
                return lastTwoOfSSN + uniqueID+randomNumber;
    }
    //List common methods/transactions
    public void deposit(double amount){
        balance = balance + amount;
        //System.out.println("Depositing: $"+amount);

    }
    public void withdraw(double amount){
        balance = balance - amount;
        //System.out.println("Withdrawing: $"+amount);

    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        //System.out.println("Transfering: $"+amount+" to "+toWhere);
    }
    public void printBalance(){
        System.out.println("Your balance is now: $"+balance);
    }
    
    public void showInfo(){
        System.out.println("NAME: "+name+"\nACCOUNT NUMBER: "+accountNumber+"\nBALANCE: $"+balance+"\nRATE: "+rate+"%");
    }
}