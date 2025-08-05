import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    *
    *Stundent 1 - Maths 78, English 56, Hindi 23.
Stundent 2 - English 78, Hindi 44, Telugu 89
Stundent 3 - English 67, Maths 67
* Student 4 - French 78, Social 56.
    * */

    public static List<Student> getStudentsData(){

        Student std1 = new Student("student1", Arrays.asList(
                new Subject("Maths",78),
                new Subject("English", 56),
                new Subject("Hindi",23)
        ));

        Student std2 = new Student("student2", Arrays.asList(

                new Subject("English", 78),
                new Subject("Hindi",44),
                new Subject("Telugu",89)
        ));

        Student std3 = new Student("student3", Arrays.asList(

                new Subject("English", 67),
                new Subject("Maths",67)

        ));

        Student std4 = new Student("student4", Arrays.asList(

                new Subject("French", 78),
                new Subject("Social",56)

        ));

        return List.of(std1,std2,std3,std4);

    }



    public static void main ( String args []) {

        List<Student> students =   getStudentsData();

    List<FlatMapStudent> flatMaps =   students.stream().flatMap(student -> student.getSubjects().stream().map(
                subject ->
                        new FlatMapStudent(student.getStudentName(), subject.getSubjectName(), subject.getMarks())
        )).sorted(Comparator.comparing(FlatMapStudent::getSubjectName)
                     .thenComparing(Comparator.comparing(FlatMapStudent::getMarks).reversed()))
             .collect(Collectors.toList());

        flatMaps.stream().forEach(
                a->
                        System.out.println(a.toString())
        );



    }


}