import java.util.Scanner;

public class Atm {
    private double accountBalance = 1000.0;

    public void depositAmount(double amount) {
        accountBalance += amount;
    }

    public void withdrawAmount(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkAccountBalance() {
        System.out.println("Current Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Atm atmMachine = new Atm();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Enter amount:");
                    atmMachine.depositAmount(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount:");
                    atmMachine.withdrawAmount(sc.nextDouble());
                    break;
                case 3:
                    atmMachine.checkAccountBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
