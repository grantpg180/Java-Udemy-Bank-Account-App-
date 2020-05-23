package bankaccountapp;

public class Savings extends Account{
    //list the properties specific for savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //constructor to initialize the settings for the savings properties
    public Savings(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDeopsitBox();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() -.25;    
    }

    
    private void setSafetyDeopsitBox(){
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
    }
    //list any methods specific to the savings account
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: SAVINGS");
        super.showInfo();
        System.out.println("Your Savings Account Features: "+"\nSafety Deposit Box ID: "+safetyDepositBoxID+"\nSafety Deopsit Box Key: "+safetyDepositBoxKey);
    }
   
    
}
