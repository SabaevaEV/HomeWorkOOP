package HW6.View;

import HW6.data.Group;
import HW6.data.Student;
import HW6.data.Teacher;
import HW6.data.UserInterface;

import java.util.List;

public class StudentView <T extends UserInterface> implements UserView <T>{

    @Override
    public void sendOnConsole(List<Group<T>> groups) {

    }

    @Override
    public void sendOnConsoleUserGroup(Group<T> Group) {

    }

    @Override
    public void sendOnConsoleListStudent(List<Student> students) {

    }

    @Override
    public void sendOnConsoleListTeacher(List<Teacher> teachers) {

    }
}