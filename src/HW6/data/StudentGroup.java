package HW6.data;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup <T extends UserInterface>
{
    private String groupName; // Имя группы
    private List<T> students; //лист студентов

    // Создание конструктора, который принимает значение полей класса StudentGroup,
    // внутри конструктора происходит инициализация полей для передачи значений объекта.
    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<T> getStudents() {
        return students;

    }

    public void setStudents(List<T> students) {
        this.students = students;
    }

    // Метод для добавления студента.
    public void addStudent(T student) {
        students.add(student);
    }

    // Метод для удаления студента.
    public void removeStudent(T student) {
        students.remove(student);
    }
}

