package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private int numGroup;
    private List<Student> students = new ArrayList<>();

    public StudyGroup(int numGroup, List<Student> students) {
        this.numGroup = numGroup;
        this.students = students;
    }

    public void addStudent (Student student){
        students.add(student);
    }
//    public void removeStudent (Student student){
//        students.remove(student);
//    }
//
//    public int getNumGroup() {
//        return numGroup;
//    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setNumGroup(int numGroup) {
//        this.numGroup = numGroup;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    @Override
    public String toString() {
        return "\n" + "StudyGroup " + '\n' +
                "  numGroup=" + numGroup +
                 students;
    }


    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}
