package java;
public class PayRollSystemMain {
  public static void main(String[] args) {
    
  
  Employee emp1 = new PartTimeEmployee(12, 300, 01, "Hari");
  Employee emp2 = new FullTimeEmployee(26000, 02, "ravi");
  PayRollSystem ps = new PayRollSystem();

  ps.EmployeeDetails();
  ps.AddEmployee(emp1);
  ps.AddEmployee(emp2); 
  ps.RemoveEmployee(2);
  ps.EmployeeDetails();


  }
}
