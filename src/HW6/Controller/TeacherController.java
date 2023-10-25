package HW6.Controller;

import HW6.View.UserView;
import HW6.data.Group;
import HW6.data.UserInterface;

import java.util.ArrayList;
import java.util.List;

//Single responsibility principle
//Liskov substitution principle
//Open-closed principle
//Interface segregation principle
//TeacherController используется только для учителей
public class TeacherController <T extends UserInterface> implements UserController<T> {
    protected List<Group<T>> teachergroups;
    protected UserView<T> teacherView;

    public TeacherController(UserView<T> teacherView) {
        teachergroups = new ArrayList<>();
        this.teacherView = teacherView;
    }

    // Метод создания группы учителей.
    public void createGroup(String groupName) {
        Group<T> group = new Group<>(groupName);
        teachergroups.add(group);
    }

    // Метод добавления учителя в группу.
    public void addToGroup(Group<T> group, T teacher) {
        group.addTeacher(teacher);
    }

    // Метод удаления учителя из группы.
    public void removeFromGroup(Group<T> group, T teacher) {
        group.removeStudent(teacher);
    }

    // Метод получения всех групп учителей.
    public List<Group<T>> getGroups() {
        return teachergroups;
    }

    // Метод, который отправляет группы в консоль.
    public void sendGroupsOnConsole() {
        teacherView.sendOnConsole(teachergroups);
    }

}
