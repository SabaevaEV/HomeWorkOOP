package HW4;

public class TeacherService {
    public boolean validateName(Teacher teacher) {

        return teacher.getName() != null && !teacher.getName().isEmpty();
    }

    public boolean validateSubject(Teacher teacher) {

        return  teacher.getSubject() != null && !teacher.getSubject().isEmpty();
    }

}
