package HW6.data;

//Single responsibility principle
//Liskov substitution principle
//Open-closed principle

public class Student extends User {
    private int id;
    public Student(String name, String lastName, String dateOfBirth, Integer id){
        super(name, lastName, dateOfBirth);
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "СТУДЕНТ "  + ", " +
                " id=" + id + ", " +
                " Имя - " + name  + ", " +
                " Фамилия - " + lastName  + ", " +
                " Дата рождения - " + dateOfBirth ;
    }
}
