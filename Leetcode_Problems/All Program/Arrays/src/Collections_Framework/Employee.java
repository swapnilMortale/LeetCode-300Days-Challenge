package Collections_Framework;

public class Employee
{
    private String name;
    private int empId;
    private double basicSalary;

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateHRA()
    {
        return this.basicSalary * 0.40 ;
    }
    public double calculateDA()
    {
        return this.basicSalary * 0.25 ;
    }

    public double calculatePF()
    {
        return basicSalary * 0.12;
    }

    public double calculateNetSalary()
    {
        double hra = calculateHRA();
        double da = calculateDA();
        double pf = calculatePF();

        return basicSalary + hra + da - pf;
    }

    public Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    @Override
    public  String toString()
    {
        return "["+name+","+empId+","+basicSalary+","+calculateNetSalary()+"]";
    }
}
