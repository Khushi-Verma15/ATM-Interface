// ATM Interface using classes and objects method that has functionalities of OOPS concept
// This atm interface has four parameters in the class
// As no database is linked to cross check the pin, I manually fixed one pin as correct and tested the cases
// Basic fundamentals are applied hence no public and private function are used here 

import java.util.Scanner;
class ATM{
    float Balance;
    int PIN = 4268;

    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        int enteredpin;
        while(true){
            System.out.println("Enter your PIN:");
            enteredpin= sc.nextInt();
            if(enteredpin==PIN){
                menu();
            }
            else{
                System.out.println("Invalid PIN,Enter a valid PIN:");
            }
        }
        // sc.close();
        }
        public void menu(){
            System.out.println("Enter your choices:");
            System.out.println("1.Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.EXIT");
             
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if(option==1){
                checkBalance();

            }
            else if(option==2){
                withdrawMoney();
            }
            else if(option==3){
                depositMoney();

            }
            else if(option==4){
                return;
            }
            else{
                System.out.println("Enter a valid option!");
            }

        }

        public void checkBalance(){
            System.out.println("Balance:" + Balance);
            menu();

        }
        public void withdrawMoney() {
            System.out.println("Enter the amount:");
            Scanner sc = new Scanner(System.in);
            float Amount = sc.nextFloat();

            if (Amount>Balance){
                System.out.println("Insufficient Balance");
            }
            else {
                Balance = Balance - Amount;
                System.out.println("Money withdrawl request is completed");
            }
            menu();
        }
        public void depositMoney(){
            System.out.println("Enter the amount you wish to deposit:");
            Scanner sc = new Scanner(System.in);
            float Amount = sc.nextFloat();
            Balance = Balance + Amount;
            System.out.println("The amount deposited successfully");
            menu();

        }

}

public class Atminterface{
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();

        

    }

}



