package HW6.View;

import java.util.List;

import HW6.data.*;

public interface UserView<T extends UserInterface> {
    void sendOnConsole(List<Group<T>> groups);
    void sendOnConsoleUserGroup(Group<T> Group);
    void sendOnConsoleListStudent(List<Student> students);
    void sendOnConsoleListTeacher(List<Teacher> teachers);
}