import java.util.List;

public class Student {
    private String studentName;
    private List<Subject> subjects;

    public String getStudentName() {
        return studentName;
    }

    public Student(String studentName, List<Subject> subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
