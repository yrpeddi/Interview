public class FlatMapStudent {
    private String studentName;
    private String subjectName;
    private Integer marks;

    public FlatMapStudent(String studentName, String subjectName, Integer marks) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "{" +
                "studentName='" + studentName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
