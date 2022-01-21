import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school1 = new School(new ArrayList<>(), new ArrayList<>(),"Uhill","High School");
        Student student1 = new Student("Dave", "Mon", 1);
        Student student2 = new Student("Felix", "Bu", 2);
        Student student3 = new Student("Alec", "Situ", 3);
        Student student4 = new Student("Big Man", "Joe", 4);
        Student student5 = new Student("Le Man", "The Man", 5);
        Student student6 = new Student("Grant", "Meta", 6);
        Student student7 = new Student("Joey", "Hafu", 7);
        Student student8 = new Student("Connor", "Welshman", 8);
        Student student9 = new Student("Cringe", "Alec", 9);
        Student student10 = new Student("Dwarfes", "Planetes", 10);

        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student4);
        school1.addStudent(student5);
        school1.addStudent(student6);
        school1.addStudent(student7);
        school1.addStudent(student8);
        school1.addStudent(student9);
        school1.addStudent(student10);

        Teacher teacher1 = new Teacher("Big Man", "Kwong", "Physics");
        Teacher teacher2 = new Teacher("Caitlyn", "Piltover", "Archery");
        Teacher teacher3 = new Teacher("Vi", "Vander", "P.E.");

        school1.addTeacher(teacher1);
        school1.addTeacher(teacher2);
        school1.addTeacher(teacher3);

        school1.showStudents();
        System.out.println();
        school1.showTeachers();

        school1.removeStudent(student1);
        school1.removeStudent(student2);
        school1.removeTeacher(teacher1);

        System.out.println();
        System.out.println();

        school1.showStudents();
        System.out.println();
        school1.showTeachers();



    }

}
