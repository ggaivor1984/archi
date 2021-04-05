package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mark Twen", "Literature");
        Student student1 = new Student("Robin Parkins");

        teacher.evaluate(student1);
    }
}
