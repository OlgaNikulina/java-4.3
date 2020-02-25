public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentOne = (int) service.calculate(12, 9.99, 1000000);
        System.out.println(paymentOne);
        int paymentTwo = (int) service.calculate(24, 9.99, 1000000);
        System.out.println(paymentTwo);
        int paymentThree = (int) service.calculate(36, 9.99, 1000000);
        System.out.println(paymentThree);
    }
}
