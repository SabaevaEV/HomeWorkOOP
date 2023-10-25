package HW6;

import HW6.Controller.StudentController;
import HW6.Controller.TeacherController;
import HW6.View.AllView;
import HW6.data.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AllView studentView = new AllView();
        AllView teacherView = new AllView();
        StudentController<UserInterface> studentController = new StudentController<>(studentView);
        TeacherController<UserInterface> teacherController = new TeacherController<>(teacherView);

        // Создание групп студентов.
        studentController.createGroup("Группа 1");
        studentController.createGroup("Группа 2");
        //Создание групп учителей
        teacherController.createGroup("Историки");
        teacherController.createGroup("Математики");
        teacherController.createGroup("Лингвисты");

        // Создание студентов.
        Student student1 = new Student("Иван", "Петров", "23.03.98", 1);
        Student student2 = new Student("Вероника", "Орлова", "15.07.21", 2);
        //Создание учителей
        Teacher teacher1 = new Teacher("Виктор", "Фролов", "12.04.91", "История средних веков");
        Teacher teacher2 = new Teacher("Петр", "Никитин", "03.06.77", "Математический анализ");
        Teacher teacher3 = new Teacher("Александра", "Кукушкина", "28.08.89", "Английский Язык");

        // Получение групп студентов.
        Group<UserInterface> group1 = studentController.getGroups().get(0);
        Group<UserInterface> group2 = studentController.getGroups().get(1);
        // Получение групп учителей
        Group<UserInterface> teachgroup1 = teacherController.getGroups().get(0);
        Group<UserInterface> teachgroup2 = teacherController.getGroups().get(1);
        Group<UserInterface> teachgroup3 = teacherController.getGroups().get(2);

        // Добавление групп студентов в другие группы.
        studentController.addToGroup(group1, student1);
        studentController.addToGroup(group2, student2);
        // Добавление групп учителей в другие группы
        teacherController.addToGroup(teachgroup1, teacher1);
        teacherController.addToGroup(teachgroup2, teacher2);
        teacherController.addToGroup(teachgroup3, teacher3);

        // Вывод информации в консоль спомощью view.
        studentController.sendGroupsOnConsole();
        teacherController.sendGroupsOnConsole();
    }
}