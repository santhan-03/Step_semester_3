class Employee {
    String id;
    double salary;

    // Constructor uses this to resolve naming clash
    Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // this.salary resolves the field/parameter clash
    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void display() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class M2 {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        for (Employee e : employees) {
            e.raiseSalary(5000);
            e.display();
        }
    }
}