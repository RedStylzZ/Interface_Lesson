import model.StudentMain;
import model.Informatikstudent;
import model.Wirtschaftsstudent;

public class Main {

    public static void main(String[] args) {
        StudentMain informatikStudent = new Informatikstudent("Tizian2", "Informatik2");
        StudentMain wirtschaftsStudent = new Wirtschaftsstudent("Nico", "Wirtschaft");

        informatikStudent.setName("Tizian");
        informatikStudent.setCourse("Informatik");

        wirtschaftsStudent.setName("Nico2");
        wirtschaftsStudent.setCourse("Wirtschaft2");

        System.out.println(informatikStudent.getName());
        System.out.println(wirtschaftsStudent.getName());

        System.out.println(informatikStudent); //Overwritten toString method
        System.out.println(wirtschaftsStudent); //Abstract toString method

        System.out.println("Module\n" +
                informatikStudent.anzahlModule() + "\n" +
                wirtschaftsStudent.anzahlModule());

    }

}
