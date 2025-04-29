class Wallet {
    private double totalAmount;

    public void addMoney(double amount) {
        if (amount > 0) totalAmount += amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addMoney(600);
        System.out.println(myWallet.getTotalAmount());
    }
}
