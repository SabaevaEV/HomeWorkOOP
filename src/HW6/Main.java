package HW6;

import HW6.View.View;
import HW6.data.Group;
import HW6.data.Student;
import HW6.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Student student = new Student("Артем", "Артемов", "08.10.2007", 1);
        Student student1 = new Student("Игорь", "Артемов", "08.10.2007", 2);
        Student student2 = new Student("Илья", "Артемов", "08.10.2007", 3);
        Student student4 = new Student("Григорий", "Артемов", "08.10.2007", 4);
//        Student student5 = new Student("Василий", "Артемов", "08.10.2007", 5);
        view.createGroup(new Group(new ArrayList<>(List.of(student1, student2, student, student4)),
                new Teacher("Иван",  "Иванов",
                        "08.10.1977", "Математика"), 10));
        view.createStudent(10, "Василий", "Артемов", "08.10.2007", 5);
        view.printInfo();
    }
}