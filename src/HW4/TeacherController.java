package HW4;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {

    private List<Teacher> teacherList = new ArrayList<>();
    private TeacherService teachService = new TeacherService();
    private TeacherView view = new TeacherView();


    public TeacherController(TeacherService teachService, TeacherView view) {
        this.teachService = teachService;
        this.view = view;
    }

    public void createTeacher(String name, String subject) {
        Teacher createteacher = new Teacher(name, subject);
        if (teachService.validateName(createteacher) && teachService.validateSubject(createteacher)) {
            teacherList.add(createteacher);
        } else {
            System.out.println("Error: Validation failed for teacher data.");
        }
    }
    public void viewTeacherList() {
        for (Teacher teacher : teacherList) {
            view.teacherView(teacher);
        }
    }

}
