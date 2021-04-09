package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Vasilii", "Group 123");
        Teacher teacher1 = new Teacher("Bob Marley", "Philosophy");
        student1.getGroupName();
        teacher1.getSubjectName();

        student1.printInfo();
        teacher1.printInfo();

    }
}
