package Banking;
class excBanking {

        public static float Deposit (float amt){
            welcomeBank.balance += amt;
            return welcomeBank.balance;
        }

        public static float Withdraw(float amt){
            welcomeBank.balance -= amt;
            return welcomeBank.balance;
        }

        public static void Details() {
            System.out.println("Name is: " + welcomeBank.customer_name);
            System.out.println("Email is: " + welcomeBank.email);
            System.out.println("Phone Number is: " + welcomeBank.phone_number);
            System.out.println("Account Number is: " + Banking.welcomeBank.account_number);
            System.out.println("Balance is: " + welcomeBank.balance);
        }
    }

