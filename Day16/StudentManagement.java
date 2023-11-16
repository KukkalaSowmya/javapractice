//Student Data ManagementCreate a class called Student with properties like rollNumber, name, and marks. Use an ArrayList to store multiple student objects. Implement methods to:• Add new students to the list.• Remove students from the list based on roll number.• Search for a student by roll number and display their details.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    private ArrayList<Student> studentList;
  
    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int rollNumber) {
      Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
        Student student = iterator.next();
        if (student.getRollNumber() == rollNumber) {
          iterator.remove();
           System.out.println("Student with roll number " + rollNumber + " removed successfully.");
            return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
    public void searchStudent(int rollNumber) {
        for (Student student : studentList) {
          if (student.getRollNumber() == rollNumber) {
            System.out.println("Student details:");
            System.out.println(student);
            return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add Student");
          String Addstudent = sc.nextLine();
            System.out.println("Remove Student");
           String RemoveStudent = sc.nextLine();
            System.out.println("Search Student");
          String SearchStudent = sc.nextLine();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            scanner.nextLine();
        System.out.print("Enter Roll Number to search: ");
         int searchRollNumber = scanner.nextInt();
         studentManagement.searchStudent(searchRollNumber);
                  
            }
        }
    }

