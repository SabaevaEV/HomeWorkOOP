package HW6.Controller;

import HW6.data.Group;
import HW6.View.UserView;
import HW6.data.UserInterface;

import java.util.ArrayList;
import java.util.List;

//Single responsibility principle
//Liskov substitution principle
//Open-closed principle
//Interface segregation principle

//StudentController используется только для студентов
public class StudentController<T extends UserInterface> implements UserController<T>{

    protected List<Group<T>> studentgroups;
    protected UserView<T> studentView;

    public StudentController(UserView<T> studentView) {
        studentgroups = new ArrayList<>();
        this.studentView = studentView;
    }

    // Метод создания группы студентов.
    public void createGroup(String groupName) {
        Group<T> group = new Group<>(groupName);
        studentgroups.add(group);
    }


    // Метод добавления студента в группу.
    public void addToGroup(Group<T> group, T student) {
        group.addStudent(student);
    }

    // Метод удаления студента из группы.
    public void removeFromGroup(Group<T> group, T student) {
        group.removeStudent(student);
    }

    // Метод возврата всех групп студентов.
    public List<Group<T>> getGroups() {
        return studentgroups;
    }

    // Метод, который отправляет группы в консоль.
    public void sendGroupsOnConsole() {
        studentView.sendOnConsole(studentgroups);
    }
}