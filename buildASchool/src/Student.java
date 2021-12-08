public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    static int studentId = 0;


    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentId = studentId + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getStudentId() {
        return studentId;
    }

    public static void setStudentId(int studentId) {
        Student.studentId = studentId;
    }

    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }



}
