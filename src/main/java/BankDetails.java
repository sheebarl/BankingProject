import java.util.Scanner;

public class BankDetails {
    String customer_name;
    String customer_address;
    int customer_contactNo;
    int customer_personalNo;
    String acc_no;
    String acc_type;
    double balance;
    double dep_amount;
    double with_amount;

    Scanner sc=new Scanner(System.in);

    public void OpenAccount(){
        System.out.print("Enter the Name : ");
        customer_name=sc.next();
        System.out.print("Enter the Address : ");
        customer_address=sc.next();
        System.out.print("Enter the Contact Number : ");
        customer_contactNo=sc.nextInt();
        System.out.print("Enter the Personal Number : ");
        customer_personalNo=sc.nextInt();
        System.out.print("Enter the Account Number : ");
        acc_no=sc.next();
        System.out.print("Enter the Account Type : ");
        acc_type=sc.next();
        System.out.print("Enter the Amount : ");
        balance=sc.nextDouble();

    }

    public void showAccountInformation(){
        System.out.println("Your account details");
        System.out.println(" Name  : "  + customer_name);
        System.out.println(" Address  : "  + customer_address);
        System.out.println(" Contact Number  : "  + customer_contactNo);
        System.out.println(" Personal Number  : "  + customer_personalNo);
        System.out.println(" Account Number  : "  + acc_no);
        System.out.println(" Account Type  : "  + acc_type);
        System.out.println("Balance : " + balance);
    }

    public void deposit(){
        System.out.print("Enter the amount to be deposit : ");
        dep_amount=sc.nextLong();
        balance=balance+dep_amount;
        System.out.println("Balance = " + balance);
    }

    public void Withdrawal(){
        System.out.print("Enter the amount to be withdraw : ");
        with_amount=sc.nextLong();
        if(balance>=with_amount) {
            balance = balance - with_amount;
            System.out.println("Balance after the withdrawal : " + balance);
        }
            else{
            System.out.println("Your balance is less than the " +  balance  + " Transaction Failed! ");
        }
    }

    public boolean Search(String accno){

        if(acc_no.equalsIgnoreCase(accno)){
            showAccountInformation();
            return true;
        }
        else{
            return false;
        }
    }
}
