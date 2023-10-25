package HW6.data;

/* класс User реализует интерфейс UserInterface */
//Open-closed principle
//Liskov substitution principle
//Dependency inversion principle

public abstract class User implements UserInterface {
    protected String name;
    protected String lastName;
    protected String dateOfBirth;

    public User(String name, String lastName, String dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
