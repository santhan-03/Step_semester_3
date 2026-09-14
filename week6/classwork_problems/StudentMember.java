public class StudentMember extends LibraryMember {

    private String course;

    public StudentMember(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Student Member | Course: " + course +
            " | Books Borrowed: " + booksBorrowed
        );
    }
}