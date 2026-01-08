package Collections_Framework;

import java.time.LocalDate;
import java.util.Arrays;

public class ListEmployee
{
    private int id;
    private short deptNo;
    private byte grade;
    private long phone;
    private float salary;
    private double bonus;
    private boolean active;
    private char gender;
    private String name;
    private LocalDate joinDate;
    private int[] projectIds;

    public ListEmployee(int id, short deptNo, byte grade, long phone, float salary,
                        double bonus, boolean active, char gender, String name,
                        LocalDate joinDate, int[] projectIds)
    {
        this.id = id;
        this.deptNo = deptNo;
        this.grade = grade;
        this.phone = phone;
        this.salary = salary;
        this.bonus = bonus;
        this.active = active;
        this.gender = gender;
        this.name = name;
        this.joinDate = joinDate;
        this.projectIds = projectIds;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", deptNo=" + deptNo +
                ", grade=" + grade +
                ", phone=" + phone +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", active=" + active +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", joinDate=" + joinDate +
                ", projectIds=" + Arrays.toString(projectIds) +
                ']';
    }
}
