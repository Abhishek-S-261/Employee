


public class Employee {
 String name;
 int id;
 double salary;
 String address;



 public Employee(String name, int id, double salary,String address) 
 {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.address=address;
 }
 
 public void display()
 {
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Salary:"+salary);
    System.out.println("Employee Address:"+address);


 }

 public static void main(String[] args) {
    Employee emp=new Employee("Abhi", 147,50000,"Hubli");
    emp.display();
 }
 

}





