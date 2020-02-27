public class CreditPaymentService {
    public int calculate(int time, double percent, int credit) {
        int payment = (int) (credit * (percent/12) / (1 - 1 / Math.pow((percent/12) + 1, time*12)));
        return payment;
    }
}


