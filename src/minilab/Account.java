package minilab;

public class Account {

    public String customerName;
    public double accountBalance;


    public Account(String customerName, double accountBalance) {

        this.customerName = customerName;
        this.accountBalance = accountBalance;


    }

    public void withdrawMoney(double x){
        if(x < accountBalance){
            accountBalance = accountBalance- x;
            System.out.println(accountBalance);
        } else{
            System.out.println("Your current balance is " + accountBalance + "...");
            System.out.println("insufficient funds");
        }


        }

        public void depositmoney(double z){

        accountBalance = accountBalance+z;
            System.out.println(accountBalance);


        }

        public void getBalance(){
            System.out.println(accountBalance);


        }



    }

