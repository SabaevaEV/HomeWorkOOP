package HW6.View;

import java.util.List;

import HW6.data.*;
//UserView позволяет использовать его для любых экземпляров классов (студент, учитель и ...),
//Liskov substitution principle
//Interface segregation principle

public interface UserView<T extends UserInterface> {
    void sendOnConsole(List<Group<T>> groups);
    void sendOnConsoleUserGroup(Group<T> group);
    void sendOnConsoleListStudent(List<Student> students);
    void sendOnConsoleListTeacher(List<Teacher> teachers);
}