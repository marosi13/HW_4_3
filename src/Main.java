public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long amount = 1000000;
        double percent = 9.99;
        //int month = 36;
        double payment12 = service.calculate(amount, 12, percent);
        double payment24 = service.calculate(amount, 24, percent);
        double payment36 = service.calculate(amount, 36, percent);
        System.out.println(Math.round(payment12));
        System.out.println(Math.round(payment24));
        System.out.println(Math.round(payment36));
    }
}
