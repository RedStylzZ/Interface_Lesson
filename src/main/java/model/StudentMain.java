package model;

public abstract class StudentMain implements Student {

    String name, course;

    public StudentMain(String name, String course) {
        this.name = name;
        this.course = course;
    }

    abstract public int anzahlModule();

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
        return "StudentMain{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
