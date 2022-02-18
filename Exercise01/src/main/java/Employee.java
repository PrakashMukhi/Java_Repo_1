class Employee1{
    float salary,hours;
    String emp_name;

    /*'getInfo()' which takes the hourly salary, number of hours of work per day of employee as parameter */
    void getInfo(String emp_name, float hours, float salary)
    {
        this.emp_name=emp_name;
        this.salary=salary;
        this.hours=hours;
    }
    /*'computeBaseSalary()' which computes the base salary for 20 days of work */
    void computeBaseSalary()
    {
        salary=salary*20;
    }
    /*'addSal()' which adds $10 to the base salary of the employee if it is less than $500. */
    void addSal()
    {
        if(salary<500)
        {
            salary=salary+10;
        }
    }
    /*'addWork()' which adds $5 daily to salary of employee if the number of hours of work per day is more than 6 hours. */
    void addWork()
    {
        if(hours>6)
        {
            salary=salary+5;
        }
    }
/*final salary. */
     public float FinalSalary()
    {
        System.out.println("Final Salary of "+ emp_name + " is $"+ salary);
        return salary;
    }
}

public class Employee{
    public static void main(String args[])
    {
        Employee1 emp1 =new Employee1();
        emp1.getInfo("John Smith",5,10);
        emp1.computeBaseSalary();
        emp1.addSal();
        emp1.addWork();
        emp1.FinalSalary();


        Employee1 emp2 =new Employee1();
        emp2.getInfo("Sandra Wang",4,5);
        emp2.computeBaseSalary();
        emp2.addSal();
        emp2.addWork();
        emp2.FinalSalary();


        Employee1 emp3 =new Employee1();;
        emp3.getInfo("Gio Rossi",7,12);
        emp3.computeBaseSalary();
        emp3.addSal();
        emp3.addWork();
        emp3.FinalSalary();

    }

}
