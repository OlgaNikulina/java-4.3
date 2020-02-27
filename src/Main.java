public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentOne = service.calculate(1, 0.0999,1000000);
        System.out.println(paymentOne);
        int paymentTwo = service.calculate(2, 0.0999, 1000000);
        System.out.println(paymentTwo);
        int paymentThree = service.calculate(3, 0.0999, 1000000);
        System.out.println(paymentThree);
    }
}
