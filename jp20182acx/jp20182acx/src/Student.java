
import java.io.Serializable;

public class Student implements Serializable{
int roll;
String name;
float marks;

    public Student() {
    }

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name=" + name + ", marks=" + marks + '}';
    }


}
