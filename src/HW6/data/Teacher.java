package HW6.data;

//Single responsibility principle
//Liskov substitution principle
//Open-closed principle
public class Teacher extends User{
    String discipline;
    public Teacher(String name, String lastName, String dateOfBirth, String discipline) {
        super(name, lastName, dateOfBirth);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "УЧИТЕЛЬ"  + ", " +
                " Предмет - " + discipline  + ", " +
                " Имя - " + name + ", " +
                " Фамилия - " + lastName  + ", " +
                " Дата рождения - " + dateOfBirth ;
    }
}
