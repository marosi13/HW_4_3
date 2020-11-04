public class CreditPaymentService {
    public double calculate(long amount,int month, double percent){
        double mp = 0.01*percent/12; // month percent
        double m = Math.pow(1 + mp, month);
        double payment = amount * ( mp + mp/(m-1));
        return payment;
    }
}
