class Employee{
  private int id;
  private String name;
  private double salary;
  public Employee(int id, String name,double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;}
  public void raiseSalary(double percent){
    if(percent>0){
      double increment=salary*percent/100;
      salary=salary+increment;
    System.out.println("New Salary: " +salary);}
    else{
      System.out.println("Salary: "+salary);}}
  public void getEmpDetails(){
    System.out.println(name + " " + id + " "+ salary);}
  public void compare(Employee emp1,Employee emp2){
    if (emp1.salary>emp2.salary) {
      System.out.println(name + " "+ id + " gets more salary: "+salary );}
    else {
      System.out.println(emp2.name + " "+ emp2.id + " gets more salary: "+emp2.salary );      
    }
    }
}
      
public class TestEmployee{
  public static void main(String[] args){
    Employee emp1=new Employee(1,"ben",5000);
    Employee emp2=new Employee(2,"sam", 10000);
    emp1.getEmpDetails();
    emp2.getEmpDetails();
    emp1.raiseSalary(10);
    emp2.raiseSalary(10);
    emp1.getEmpDetails();
    emp2.getEmpDetails();
    emp1.compare(emp1, emp2);
  
  }
}  
