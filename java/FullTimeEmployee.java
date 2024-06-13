package java;

public class FullTimeEmployee extends Employee{
  double salary;

  public FullTimeEmployee(double salary,int EmpId,String EmpName){
    super(EmpId, EmpName);
    this.salary=salary;
  }

  public double CalculateSalary(){
    return salary;
  }

}
