package Employee;

import Student.Monitor;
import Student.Student;

public class Baddegama {
     public static void main(String[] args) {
      
           Employee emp1=new Employee();
    
    emp1.setEmployeeId("emp256");
    emp1.setName("Deshan");
    emp1.setAddress("Wanduramba");
    emp1.setSex("Male");
    emp1.setAge(20);
    emp1.Work();
    
    System.out.println("Employee EmployeeId "+emp1.getEmployeeId());
    System.out.println("Employee Name "+emp1.getName());
    System.out.println("Employee Address "+emp1.getAddress());
    System.out.println("Employee Gender "+emp1.getSex());
    System.out.println("Employee Age "+emp1.getAge());
    System.out.println("");
    
    ManagementStaff m1=new ManagementStaff();
    
    m1.setEmployeeId("emo635407");
    m1.setName("Saman");
    m1.setAddress("Galle");
    m1.setSex("male");
    m1.setAge(33);
    m1. Management("Maneger");
    
    System.out.println("Employee EmployeeId "+m1.getEmployeeId());
    System.out.println("Employee Name "+m1.getName());
    System.out.println("Employee Address "+m1.getAddress());
    System.out.println("Employee Gender "+m1.getSex());
    System.out.println("Employee Age "+m1.getAge());
    System.out.println("");
    
    Instructor i1=new Instructor();
    
    i1.setEmployeeId("emo635407");
    i1.setName("Saman");
    i1.setAddress("Galle");
    i1.setSex("male");
    i1.setAge(33);
    i1. Teach("Software Developer");
    
    System.out.println("Employee EmployeeId "+i1.getEmployeeId());
    System.out.println("Employee Name "+i1.getName());
    System.out.println("Employee Address "+i1.getAddress());
    System.out.println("Employee Gender "+i1.getSex());
    System.out.println("Employee Age "+i1.getAge());
    System.out.println("");
    
     Assistant a1=new Assistant();
    
    a1.setEmployeeId("emo635407");
    a1.setName("Saman");
    a1.setAddress("Galle");
    a1.setSex("male");
    a1.setAge(33);
    a1. help("Account");
    
    System.out.println("Employee EmployeeId "+a1.getEmployeeId());
    System.out.println("Employee Name "+a1.getName());
    System.out.println("Employee Address "+a1.getAddress());
    System.out.println("Employee Gender "+a1.getSex());
    System.out.println("Employee Age "+a1.getAge());
    System.out.println("");
    
    Student s1=new Student();
    
    s1.setName("Nimali");
    s1.setAddress("Galle");
    s1.setSex("Female");
    s1.setContact("0773216548");
    s1.setAge(23);
    s1.Study();
    
    System.out.println("Student Name "+s1.getName());
    System.out.println("Student Address "+s1.getAddress());
    System.out.println("Student Gender "+s1.getSex());
    System.out.println("Student Contact "+s1.getContact());
    System.out.println("Student Age "+s1.getAge());
    System.out.println("");
    
     // Monitor m1=new Monitor();
    
   // m1.setName("Nimali");
   // m1.setAddress("Galle");
   // m1.setSex("Female");
   // m1.setContact("0773216548");
   // m1.setAge(23);
   // m1.Monitoring("c1");
    
   // System.out.println("Student Name "+m1.getName());
   // System.out.println("Student Address "+m1.getAddress());
   // System.out.println("Student Gender "+m1.getSex());
   // System.out.println("Student Contact "+m1.getContact());
   // System.out.println("Student Age "+m1.getAge());
   // System.out.println("");
    
    } 
}
