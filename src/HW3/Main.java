package HW3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Kolya", 18, 1);
        Student st2 = new Student("Vova", 22, 1);
        Student st3 = new Student("Petr", 19, 1);
        Student st4 = new Student("Vera", 21, 1);
        Student st5 = new Student("Ivan", 19, 1);
        Student st6 = new Student("Sveta", 22, 1);
        Student st7 = new Student("Ira", 28, 1);
        Student st8 = new Student("Fedya", 20, 1);
/*  Для проверки
//        List<Student> studentList1 = new ArrayList<>(List.of(st1, st2));
//        List<Student> studentList2 = new ArrayList<>(List.of(st3, st4));
//        List<Student> studentList3 = new ArrayList<>(List.of( st4,st5));
//        List<Student> studentList4 = new ArrayList<>(List.of(st7,st8));
//        System.out.println(studentList1);
//        System.out.println(studentList2);
//        System.out.println(studentList3);
//        System.out.println(studentList4);

 */

        List<Student> group1 = new ArrayList<>();
        List<Student> group2 = new ArrayList<>();
        List<Student> group3 = new ArrayList<>();
        List<Student> group4 = new ArrayList<>();

        StudyGroup gr1 = new StudyGroup(1,group1);
        StudyGroup gr2 = new StudyGroup(2,group2);
        StudyGroup gr3 = new StudyGroup(3,group3);
        StudyGroup gr4 = new StudyGroup(4,group4);
        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr2.addStudent(st3);
        gr2.addStudent(st4);
        gr3.addStudent(st5);
        gr3.addStudent(st6);
        gr4.addStudent(st7);
        gr4.addStudent(st8);
//        System.out.println(gr1);
//        System.out.println(gr2);
//        System.out.println(gr3);
//        System.out.println(gr4);

        List<StudyGroup> stream1 = new ArrayList<>();
        List<StudyGroup> stream2 = new ArrayList<>();
        Stream str1 = new Stream (stream1);
        Stream str2 = new Stream (stream2);
        str1.addGroup(gr1);
        str2.addGroup(gr2);
        str2.addGroup(gr3);
        str2.addGroup(gr4);
//        System.out.println(str1);
//        System.out.println(str2);

        List<Stream> streamS = new ArrayList<>();
        StreamService streamService = new StreamService();
        streamService.addStream(str1);
        streamService.addStream(str2);
        streamService.sortStreams(streamS);

        System.out.println(streamService.getStream());

    }
}
