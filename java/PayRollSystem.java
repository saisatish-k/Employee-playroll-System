package java;

import java.util.ArrayList;

public class PayRollSystem {
  ArrayList<Employee> employeeList;

  public PayRollSystem(){
    this.employeeList = new ArrayList<>();
  }
public void AddEmployee(Employee e){
  employeeList.add(e);
  System.out.println(e+"\nEmployee Added");
}

public void RemoveEmployee(int id){
  for (Employee e : employeeList) {
    if(e.getEmpId()==id){
      employeeList.remove(e);
      System.out.println(e +"\n Employee removed");
      break;
    }
  }
}

public void EmployeeDetails(){
  System.out.println("Employee Details:-");
  for (Employee e: employeeList) {
    System.out.println(e);
  }
}


}
