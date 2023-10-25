package HW6.View;

import HW6.data.Group;
import HW6.data.Student;
import HW6.data.Teacher;
import HW6.data.UserInterface;

import java.util.List;
//Interface segregation principle
//Liskov substitution principle
//Open-closed principle

public class AllView <T extends UserInterface> implements UserView <T>{

    @Override
    public void sendOnConsole(List<Group<T>> groups) {
        for (Group<T> n : groups) {
            System.out.println(n.getStudents());
//            System.out.println(n.getTeachers());
        }
    }

    @Override
    public void sendOnConsoleUserGroup(Group<T> group) {
        System.out.println(group.getStudents());
        System.out.println(group.getTeachers());
    }

    @Override
    public void sendOnConsoleListStudent(List<Student> students) {
        System.out.println(students.toString());
    }

    @Override
    public void sendOnConsoleListTeacher(List<Teacher> teachers) {
        System.out.println(teachers.toString());
    }
}