class FeeAccount {
    void pay(double amount) {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {
    @Override
    void pay(double amount) {
        System.out.println("Paid in two installments (hostel account)");
    }
}

class PaymentProcessor {

    int hostelCount = 0;
    int dayScholarCount = 0;

    void processPayment(FeeAccount account, double amount) {

        // instanceof checks the actual object type
        if (account instanceof HostelFeeAccount) {
            account.pay(amount);
            hostelCount++;
        } else {
            account.pay(amount);
            dayScholarCount++;
        }
    }

    void displayCount() {
        System.out.println("Hostel accounts processed: " + hostelCount
                + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}

public class M5 {
    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        PaymentProcessor processor = new PaymentProcessor();

        for (FeeAccount account : accounts) {
            processor.processPayment(account, 60000);
        }

        processor.displayCount();
    }
}