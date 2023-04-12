public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000);
        System.out.println("Остаток на счете: " + account.getAmount() + " сом");

        try {
            while (true) {
                account.withDraw(6000);
                System.out.println("Сумма 6000 сом снята со счета");
            }
        } catch (LimitException e) {
            System.out.println("Недостаточно средств на счете. Снято " + e.getRemainingAmount() + " сом");
        }
    }
}