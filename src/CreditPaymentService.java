public class CreditPaymentService {
    public long calculate(int time, double percent, int credit) {
        int payment = (int) (credit * (percent + ((percent / (1 + percent)) - 1)));
        return payment;
    }
}


