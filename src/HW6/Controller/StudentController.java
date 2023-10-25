package HW6.Controller;

import HW6.data.Group;
import HW6.View.UserView;
//import HW6.data.Student;
import HW6.data.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class StudentController<T extends UserInterface> implements UserController<T>{

    protected List<Group<T>> groups;
    protected UserView<T> userView;

    // Создание конструктора, который принимает значение полей класса StudentController,
    // внутри конструктора происходит инициализация полей для передачи значений объекта.
    public StudentController(UserView<T> userView) {
        groups = new ArrayList<>();
        this.userView = userView;
    }

    // Метод создания группы студентов.
    public void createGroup(String groupName) {
        Group<T> group = new Group<>(groupName);
        groups.add(group);
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
        return groups;
    }

    // Метод, который отправляет группы в консоль.
    public void sendGroupsOnConsole() {
        userView.sendOnConsole(groups);
    }
}