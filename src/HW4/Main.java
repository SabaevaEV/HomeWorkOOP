package HW4;

public class Main {
    public static void main(String[] args) {
        TeacherView View = new TeacherView();
        TeacherService Validate = new TeacherService();
        TeacherController Controller = new TeacherController(Validate, View);

//        Controller.addTeacher("Jon", "Math");
//        Controller.addTeacher("Bell", "English");
//        Controller.addTeacher("Roman", "Programming");
        Controller.createTeacher("Фролов Иван Викторович", "Математика");
        Controller.createTeacher("Васильева Ольга Семеновна", "Русский язык");
        Controller.createTeacher("Коврова Ирина Анатольевна", "История");


//        Controller.TeacherView();
        Controller.viewTeacherList();
    }

}
