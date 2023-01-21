import java.security.Identity;

public class Employee {

    public static void main(String[] args) {
        Employee empone = new Employee("Rajubhai");
        empone.id(1);
        empone.setSalary(25000);
        empone.designation("HOD");
        empone.printEmp();
    }

    String name;
    int salary;
    int id;
    String designation;

    public Employee(String emp_name) {
        name = emp_name;
    }
    public void setSalary(int emp_salary) {
        salary = emp_salary;
    }
    public void id(int emp_id) {
        id = emp_id;
    }
    public void designation(String emp_designation) {
        designation = emp_designation;
    }
    public void printEmp() {
        System.out.println("Empolyee id :" + id);
        System.out.println("Employee name  : " + name);
        System.out.println("Employee designation : " +designation);
        System.out.println("Employee salary :" + salary);

    }

}