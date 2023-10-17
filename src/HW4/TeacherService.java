package HW4;

public class TeacherService {
    public boolean validateName(Teacher teacher) {
       // return name != null && !name.isEmpty();
        return teacher.getName() != null && !teacher.getName().isEmpty();
    }

    public boolean validateSubject(Teacher teacher) {
        //return subject != null && !subject.isEmpty();
        return  teacher.getSubject() != null && !teacher.getSubject().isEmpty();
    }

}
