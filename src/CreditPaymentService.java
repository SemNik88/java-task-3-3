public class CreditPaymentService {
    public double calculate(double loanAmount, double annualInterestRate, int loanPeriod) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double annuityCoefficient = (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), loanPeriod)) /
                (Math.pow((1 + monthlyInterestRate), loanPeriod) - 1);
        return annuityCoefficient * loanAmount;
    }

}
