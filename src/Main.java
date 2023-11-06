
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double loanAmount = 1000000; // сумма кредита в рублях
        double annualInterestRate = 9.99; // годовая процентная ставка
        int loanPeriod = 36; // срок кредита в месяцах

        double monthlyPayment = service.calculate(loanAmount, annualInterestRate, loanPeriod);
        System.out.println("Ежемесячный платёж: " + monthlyPayment);

    }
}