public class Main {
    public static void main(String[] args) {
        int start_bal = 100;
        int amount_p = 1100;
        int amount_bal = start_bal + amount_p;
        int bonus_p = amount_p / 100;
        if (amount_p <= 1000) {
            bonus_p = 0;
            amount_bal = start_bal + amount_p + bonus_p;
        } else {
            amount_bal = start_bal + amount_p + amount_p / 100;
        }
        System.out.println("Cтартовый баланс: " + start_bal);
        System.out.println("Сумма пополнения: " + amount_p);
        System.out.println("Итоговая Сумма: " + amount_bal);
        System.out.println("Бонус за пополнение: " + bonus_p);
    }
}
