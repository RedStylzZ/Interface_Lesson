package model;

public class Wirtschaftsstudent extends StudentMain {

    int bewlwissen = 10000;

    public Wirtschaftsstudent(String name, String course) {
        super(name, course);
    }

    @Override
    public int anzahlModule() {
        return 6;
    }

    @Override
    public String toString() {
        return "Wirtschaftsstudent{" +
                "name='" + this.name + '\'' +
                ", course='" + this.course + '\'' +
                '}';
    }

}
