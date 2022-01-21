import java.util.ArrayList;
import java.util.Arrays;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private static int schoolNumber;
    private String schoolType;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, String schoolName, String schoolType) {
        this.teachers = teachers;
        this.students = students;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        schoolNumber++;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addTeacher(Teacher add){
        teachers.add(add);
    }

    public void removeTeacher(Teacher delete){
        teachers.remove(delete);
    }

    public void addStudent(Student add){
        students.add(add);
    }

    public void removeStudent(Student delete){
        students.remove(delete);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public static int getSchoolNumber() {
        return schoolNumber;
    }

    public static void setSchoolNumber(int schoolNumber) {
        School.schoolNumber = schoolNumber;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void showStudents(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void showTeachers(){
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }

}