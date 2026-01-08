package Collections_Framework;

public class StudentList
{
    int rollno ;
    String name ;
    String college_name;
    String branch ;
    char division ;
    float marks ;

    public StudentList()
    {

    }

    public StudentList(String name, String college_name, String branch, char division,
                       float marks, int rollno)
    {
        this.name = name;
        this.college_name = college_name;
        this.branch = branch;
        this.division = division;
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "[" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", college_name='" + college_name + '\'' +
                ", branch='" + branch + '\'' +
                ", division=" + division +
                ", marks=" + marks +
                ']';
    }
}
