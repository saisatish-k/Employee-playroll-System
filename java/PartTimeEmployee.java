package java;

public class PartTimeEmployee extends Employee{

  private int workingHours;
  private int hourlySalary;
  public PartTimeEmployee(int workingHours,int hourlySalary,int EmpId,String EmpName){
    super(EmpId, EmpName);
    this.hourlySalary= hourlySalary;
    this.workingHours= workingHours;
  }

  @Override
  public double CalculateSalary() {
    return hourlySalary*workingHours;
  }

 

}
