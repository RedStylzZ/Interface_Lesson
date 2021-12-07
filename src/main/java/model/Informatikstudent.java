package model;

public class Informatikstudent extends StudentMain {

    String name, course;

    public Informatikstudent(String name, String course) {
        super(name, course);
    }

    @Override
    public int anzahlModule() {
        return 18;
    }

    @Override
    public String getCourse() {
        return this.course;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setCourse(String course) {
        if(course.isEmpty()) {
            return;
        }
        this.course = course;
    }

    @Override
    public void setName(String name) {
        if(name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Informatikstudent{" +
                "name='" + this.name + '\'' +
                ", course='" + this.course + '\'' +
                '}';
    }
}
