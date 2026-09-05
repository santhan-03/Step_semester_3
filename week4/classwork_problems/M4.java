class SrmStudent {

    static String collegeName;
    static int academicYear;

    // Static block runs only once
    static {
        collegeName = "SRM";
        academicYear = 2026;
        System.out.println("College info loaded");
    }

    String name;

    SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + name);
    }
}

public class M4 {
    public static void main(String[] args) {

        String[] names = {
            "Ravi", "Meera", "Karthik", "Divya", "Anitha"
        };

        for (String name : names) {
            new SrmStudent(name);
        }
    }
}