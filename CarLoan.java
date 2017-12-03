public class CarLoan {

    // Int Var carLoan.
    int carLoan = 1000;
    // Int loanLength.
    int loanLength = 3;
    // Int interestRate.
    int interestRate = 5;
    // Int downPayment.
    int downPayment = 2000;

    if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid a valid car loan.");
    } else if (downPayment >= carLoan) {
        System.out.println("The car can be paid in full.");
    } else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = monthlyBalance * interestRate / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
    }
    public static void main(String[] args) {

    }
}
