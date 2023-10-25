package HW6.data;

import java.util.ArrayList;
import java.util.List;

//Liskov substitution principle
//Open-closed principle

public class Group <T extends UserInterface>
{
    private String groupName; // Имя группы
    private List<T> students; // лист студентов
    private List<T> teachers; // лист учителей


    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
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

    public List<T> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<T> teachers) {
        this.teachers = teachers;
    }

    // Метод для добавления студента.
    public void addStudent(T student) {
        students.add(student);
    }
    // Метод для удаления студента.
    public void removeStudent(T student) {
        students.remove(student);
    }

    // Метод для добавления учителя
    public void addTeacher(T teacher) {
        students.add(teacher);
    }
    // Метод для удаления учителя
    public void removeTeacher(T teacher) {
        students.remove(teacher);
    }
}

