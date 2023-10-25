package HW6.data;
//UserInterface позволяет использовать его для любых экземпляров классов (студент, учитель и ...),
//Liskov substitution principle
public interface UserInterface {
    String getName();
    void setName(String name);
    String getLastName();
    void setLastName(String lastName);
    String getDateOfBirth();
    void setDateOfBirth(String dateOfBirth);
}
