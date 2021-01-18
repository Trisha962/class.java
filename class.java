import java.util.Scanner;
 
public class Employee {
 
 int empname;
 String address;
 int yearofjoining;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empname :: ");
  empname = in.nextInt();
  System.out.print("Enter the address :: ");
  address = in.next();
  System.out.print("Enter the yearofjoining :: ");
  yearofjoining  = in.nextInt();
 }
 
 public void display() {
  
  System.out.println("Employee name = " + empname);
  System.out.println("Employee address = " + address);
  System.out.println("Employee yearofjoining = " + yearofjoining);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }
 }
}
