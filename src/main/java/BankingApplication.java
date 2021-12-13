import java.util.Scanner;

public class BankingApplication {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many number of customers to be entered : ");
        int n=sc.nextInt();
        BankDetails bank[]=new BankDetails[n];
        for(int i=0;i< bank.length;i++){
            bank[i] =new BankDetails();
            bank[i].OpenAccount();
        }

        int ch;
        do{
            System.out.println("*****BankingSystemApplication*****");
            System.out.println("1.Display all account details");
            System.out.println("2.Search by account number");
            System.out.println("3.Deposit amount");
            System.out.println("4.Withdraw amount");
            System.out.println("5.Exit");
            System.out.print("Enter your choice > ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    for(int i=0;i<bank.length;i++){
                        bank[i].showAccountInformation();
                    }
                    break;
                case 2:
                    System.out.print("Enter the account number to be search : ");
                    String accno=sc.next();
                    boolean found=false;
                    for(int i=0;i< bank.length;i++) {
                        found = bank[i].Search(accno);
                        if (found) {
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account number does not exist");
                    }
                    break;
                case 3:
                    System.out.print("Enter the account number :  ");
                    accno=sc.next();
                    found=false;
                    for(int i=0;i< bank.length;i++) {
                        found = bank[i].Search(accno);
                        if (found) {
                            bank[i].deposit();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account number does not exist");
                    }
                    break;
                case 4:
                    System.out.print("Enter the account number : ");
                     accno=sc.next();
                     found=false;
                    for(int i=0;i< bank.length;i++) {
                        found = bank[i].Search(accno);
                        if (found) {
                            bank[i].Withdrawal();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account number does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Welcome Back Again!");
                    break;
                default:
                    System.out.println("Sorry, You entered the wrong choice ");
                    break;
            }
        }
        while(ch!=5);

    }
}
