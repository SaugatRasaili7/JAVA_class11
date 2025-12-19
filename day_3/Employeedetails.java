 public class Employeedetails{
  String name;
  double salary;

  Employeedetails( String n , double s){
    name = n;
    salary = s;
  }
   void calculate(){
    double bonus;
    System.out.println("The Employee name is : " + name);
    System.out.println("His/Her Salary is : " + salary);
     
     if(salary > 30000){
      bonus =  (10.0/100.0) * salary ;

      System.out.println("The Employee " + name + " Get 10% bonus i.e " + bonus);
      System.out.println(" Total salary is : " + (salary + bonus));
     }

     else if(salary < 30000){
        double lessbonus =  (5.0/100.0) * salary ;

      System.out.println("The Employee " + name + " Get 5% bonus i.e " + lessbonus);
      System.out.println(" Total salary is : " + (salary + lessbonus));
     }

     else{
        System.out.println("The Employee didn't get bonus");
     }

   }
    
    public static void main(String[] args){
        Employeedetails emp = new Employeedetails("Saugat",35000);
        emp.calculate();
        
    }
 }