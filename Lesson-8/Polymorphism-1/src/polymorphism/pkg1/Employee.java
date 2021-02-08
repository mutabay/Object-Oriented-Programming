
package polymorphism.pkg1;



public abstract class Employee {
    
    private String name ;
    private String surname;
    private double salary;
    
    public Employee()
    {
        name = "UNKNOWN";
        surname = "UNKNOWN";
        salary = 0;
    }
    
    public Employee (String name , String surname , double salary)
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSurame()
    {
        return surname;
    }
    
    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee (" + "name : " + name + "||| surname : " + surname + "||| salary : " + salary + ")"; 
    }
    
    public abstract double calculateIncome();
    
    public String PrintABC()
    {
       return "ABC";
    }
    

    
    
    
    
    
    
}
