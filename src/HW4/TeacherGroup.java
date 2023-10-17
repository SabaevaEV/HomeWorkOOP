package HW4;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private List<Teacher> groupTeacher = new ArrayList();

    public List<Teacher> getGroupTeacher() {
        return groupTeacher;
    }

    public void setGroupTeacher(List groupTeacher) {
        this.groupTeacher = groupTeacher;
    }

    public void addGroupTeacher(Teacher teacher){
        groupTeacher.add(teacher);
    }
    public void removeGroupTeacher(Teacher teacher){
        groupTeacher.remove(teacher);
    }

}
