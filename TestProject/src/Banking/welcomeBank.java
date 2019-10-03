package Banking;

import java.util.Scanner;

public class welcomeBank {
    static String account_number;
    static float balance;
    static String customer_name;
    static String email;
    static String phone_number ;

    public static void main(String[] args) {
        excBanking obj = new excBanking();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        customer_name = sc.nextLine();
        System.out.println("Enter the email");
        email = sc.nextLine();
        System.out.println("Enter the phone number");
        phone_number = sc.nextLine();
        System.out.println("Enter the account number");
        account_number = sc.nextLine();
        System.out.println("Enter the current balance");
        balance = sc.nextFloat();
        int choice, amt;
        do {
            System.out.println("Enter 1 to Deposit, 2 to Withdraw, 3 to Check details, 4 to exit");
            choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount to Deposit");
                        amt = sc.nextInt();
                        obj.Deposit(amt);
                        break;
                    case 2:
                        System.out.println("Enter the amount to Withdraw");
                        amt = sc.nextInt();
                        if (amt < balance) {
                            obj.Withdraw(amt);
                        } else System.out.println("Insufficient Balance");
                        break;
                    case 3:
                        obj.Details();
                        break;
                    default:break;
                }
            }
        while (choice != 4);
    }
}

