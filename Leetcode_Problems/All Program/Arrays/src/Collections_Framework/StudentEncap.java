package Collections_Framework;

public class StudentEncap
{
    private String name ;
    public float marks ;
    private int rollNo ;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentEncap(String name, float marks, int rollNo) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "[" + name + ", " + marks + "%, " + rollNo + "]";
    }
}
