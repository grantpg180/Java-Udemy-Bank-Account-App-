package bankaccountapp;

public class Checking extends Account {
    //list the properties specific for checking account
    int debitCardNumber;
    int debitCardPin;
    //constructor to initialize the checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber="2"+accountNumber;
        setDebitCard();
    }
    public void setRate(){
        rate = getBaseRate() * .15;    
    }

    //list any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber= (int)(Math.random()*Math.pow(10,12));
        debitCardPin= (int)(Math.random()*Math.pow(10,4));

    }
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: CHECKING");
        super.showInfo();
        System.out.println("Your Checking Account Features"+"\nDebit Card Number: "+debitCardNumber+"\nDebit Card PIN: "+debitCardPin);
    }
}