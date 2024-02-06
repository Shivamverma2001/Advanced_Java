import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }
}

public class MapFilterDemo {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<Employee>();

        employees.add(new Employee(1,"John",500));
        employees.add(new Employee(2,"Alice",700));

        employees.add(new Employee(3,"Bob",400));
        employees.add(new Employee(4,"Johny",600));

        employees.add(new Employee(5,"Alick",300));
        employees.add(new Employee(6,"Bobby",900));

        employees.stream()
                        .filter(e-> e.salary > 500)
                        .map(e->"Mr "+e.empName +"salary "+(e.salary+300))
                        .collect(Collectors.toList())
                        .forEach(e->System.out.println(e));
    }
}
