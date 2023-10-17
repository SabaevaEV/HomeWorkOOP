package HW4;

public class TeacherView {
    public void teacherView (Teacher teacher){
        //System.out.println(teacher.toString());
        System.out.println("Имя учителя - " + teacher.getName() + "\nПредмет " + teacher.getSubject());
        System.out.println("-".repeat(20));
    }
}
