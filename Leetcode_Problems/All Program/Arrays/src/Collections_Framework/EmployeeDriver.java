package Collections_Framework;


import java.util.*;

public class EmployeeDriver
{
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<>() ;
        employees.add(new Employee("John", 101, 25000));
        employees.add(new Employee("Alice", 102, 35000));
        employees.add(new Employee("Bob", 103, 18000));
        employees.add(new Employee("Emma", 104, 42000));
        employees.add(new Employee("Mike", 105, 30000));

        for (Employee emp : employees)
        {
            System.out.println(emp);
        }
    }
}
