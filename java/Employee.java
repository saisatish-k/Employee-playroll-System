package java;

abstract class Employee {
private int EmpId;
private String EmpName;

public Employee(int empId, String empName) {
  EmpId = empId;
  EmpName = empName;
}

public int getEmpId() {
  return EmpId;
}

public void setEmpId(int empId) {
  EmpId = empId;
}

public String getEmpName() {
  return EmpName;
}

public void setEmpName(String empName) {
  EmpName = empName;
}

public abstract double CalculateSalary();

@Override
public String toString() {
  return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
}


  
}