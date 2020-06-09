package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

import bankaccountapp.utilities.CSV;

public class BankAccountApp {
    public static void main(String[] args){
       List<Account> accounts = new LinkedList<Account>();
       
        //Auto-generate method stub
       /* Checking chkacc1 =  new Checking("Tom Wilson", "312345678", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "123456789", 2500);
                chkacc1.showInfo();
                System.out.println("******************");
                savacc1.showInfo();
                savacc1.compound();*/

                //test for deposite/withdrawel/transfer/accrued interests functions and print
            

              //READ CSV file then create new accounts based on file's data
                String file = "original.csv";
                List<String[]> newAccountHolder = CSV.read(file);
                for (String[] accountHolder : newAccountHolder){
                    String name = accountHolder[0];
                    String sSn = accountHolder[1];
                    String accoutnType = accountHolder[2];
                    double initDeposit = Double.parseDouble(accountHolder[3]);
                    System.out.println(name+ " "+ sSn+" "+ accoutnType+ " $"+initDeposit);
                    if(accoutnType.equals("Savings")) {
                        System.out.println("OPEN A SAVINGS ACCOUTN");
                        accounts.add(new Savings(name, sSn, initDeposit));
                    }else if (accoutnType.equals("Checking")){
                        ////System.out.println("OPEN A CHECKING ACCOUNT");
                        accounts.add(new Checking(name, sSn, initDeposit));

                    }else {
                        System.out.println("ERROR READING ACCOUTN TYPE");
                    }
                 }
                 //to display account info for the 5th account from file(database)
                            //accounts.get(5).showInfo();
                //display account info for every account from file(database) separated by *********************
                 for (Account acc : accounts){
                     System.out.println("\n*********************");
                     acc.showInfo();

                 }
                }
}