package HW6.Controller;

import java.util.List;

import HW6.data.Group;
import HW6.data.UserInterface;

// Создаём UserController
public interface UserController<T extends UserInterface>
{
    void createGroup(String groupName); // Метод создания группы .
    void addToGroup(Group<T> group, T student);// Метод добавления в группу.
    void removeFromGroup(Group<T> group, T student);// Метод удаления из группы.
    List<Group<T>> getGroups(); // Метод получения всех групп.
}
