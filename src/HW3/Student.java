package HW3;

public class Student {
    private String name;
    private Integer age;
    private Integer yearOfStudy;

    public Student(String name, Integer age, Integer yearOfStudy) {
        this.name = name;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }

//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Integer getYearOfStudy() {
//        return yearOfStudy;
//    }
//
//    public void setYearOfStudy(Integer yearOfStudy) {
//        this.yearOfStudy = yearOfStudy;
//    }

    @Override
    public String toString() {
        return "\n Student " + "\n" +
                "   name= " + name + "\n" +
                "   age= " + age +"\n" +
                "   yearOfStudy=" + yearOfStudy + "\n" + "-".repeat(20);
    }
}
