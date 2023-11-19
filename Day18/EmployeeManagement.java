//Employee ManagementCreate a class called Employee with properties like employeeId, name, and salary. Use a HashSet to store multiple employee objects. Implement methods to: Add new employees to the HashSet. Remove employees from the HashSet based on employee ID. Search for an employee by employee ID and display their details. Display the details of all employees.

 import java.util.HashSet;

 class Employee {
   private String employeeId;
   private String name;
   private int salary;

   public Employee(String employeeId, String name, int salary) {
     this.employeeId = employeeId;
     this.name = name;
     this.salary = salary;
   }

   public String getEmployeeId() {
     return employeeId;
   }

   public String getName() {
     return name;
   }

   public int getSalary() {
     return salary;
   }
 }

 public class EmployeeManagement {
   private HashSet<Employee> employees = new HashSet<>();

   public void addEmployee(Employee employee) {
     employees.add(employee);
     System.out.println("employee added.");
   }

   public void removeEmployee(String employeeId) {
     for(Employee employee : employees) {
       if(employee.getEmployeeId().equals(employeeId)) {
         employees.remove(employee);
         System.out.println("employee removed.");
         return;
       }
     }
     System.out.println("employee is not found.");
   }

   public void searchEmployee(String employeeId) {
     for(Employee employee : employees) {
       if(employee.getEmployeeId().equals(employeeId)) {
         System.out.println("Employee details:");
         System.out.println("Employee id: " + employee.getEmployeeId());
         System.out.println("Employee name: " + employee.getName());
         System.out.println("Employee salary: " + employee.getSalary());
         return;
       }
     }
     System.out.println("Employee with id " + employeeId + " not found.");
   }

   public void displayEmployees() {
     System.out.println("Employee details:");
     for(Employee employee : employees) {
       System.out.println("Employee id: " + employee.getEmployeeId());
       System.out.println("Employee name: " + employee.getName());
       System.out.println("Employee salary: " + employee.getSalary()); 
     }
   }

   public static void main(String args[]) {
     EmployeeManagement employeeManagement = new EmployeeManagement();
     employeeManagement.addEmployee(new Employee("36", "Shreeja", 10000));
     employeeManagement.addEmployee(new Employee("58", "Nidhiya", 20000));

     employeeManagement.removeEmployee("36");
     employeeManagement.searchEmployee("58");
     employeeManagement.displayEmployees();
   }
 }