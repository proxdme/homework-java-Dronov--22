public class Main {
    public static void main(String[] args) {
        int clientStartingBalance = 100;
        int amountPayment = 1100;
        int totalAmount = clientStartingBalance + amountPayment;
            int depositBonus = amountPayment / 100;
        if (amountPayment <= 1000) {
            depositBonus = 0;
            totalAmount = clientStartingBalance + amountPayment + depositBonus;
        } else {
            totalAmount = clientStartingBalance + amountPayment + amountPayment / 100;
        }
        System.out.println("Client Starting Balance: " + clientStartingBalance);
        System.out.println("Amount Paymet: " + amountPayment);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Deposit Bonus: " + depositBonus);
    }
}
