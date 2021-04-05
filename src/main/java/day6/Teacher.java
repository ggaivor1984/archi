package day6;


public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

   /* public void setName(String name) {
        this.name = name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }*/

    public void evaluate(Student student) {
        int rand = (int) (Math.random() * 4 + 2);

        String mark = null;
        switch (rand) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + discipline + " на оценку " + mark + ".");
    }
}
