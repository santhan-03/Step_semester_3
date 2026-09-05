class FeeAccount {
    String regNo;
    double totalFee;

    FeeAccount(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    // final cannot be overridden
    final double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }

    // final cannot be overridden
    final void printSummary(int daysLate) {

        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);

            System.out.println(regNo + " | Total Fee: Rs " +
                    totalFee + " | Late Fee: Rs " + lateFee);
        }
    }
}

public class M3 {
    public static void main(String[] args) {

        String[] regNos = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate = {10, 0, -2, 5};

        FeeAccount[] accounts = {
            new FeeAccount(regNos[0], totalFees[0]),
            new FeeAccount(regNos[1], totalFees[1]),
            new FeeAccount(regNos[2], totalFees[2]),
            new FeeAccount(regNos[3], totalFees[3])
        };

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].printSummary(daysLate[i]);
        }
    }
}