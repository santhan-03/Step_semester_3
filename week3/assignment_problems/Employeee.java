class Employeee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employeee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Employeee e1 = new Employeee("Ravi", 50000);
        Employeee e2 = new Employeee("Priya", 60000);
        Employeee e3 = new Employeee("Arjun", 45000);

        Employeee.printCompanyInfo();
    }
}