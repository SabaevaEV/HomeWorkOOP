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


    public void viewTeacherList() {
        for (Teacher teacher : teacherList) {
            view.teacherView(teacher);
        }
    }

}
