
package ınheritance;



public class Employeee {
    
    private String name ;
    private String surname;
    private double salary;
    
    public Employeee()
    {
        name = "UNKNOWN";
        surname = "UNKNOWN";
        salary = 0;
    }
    
    public Employeee (String name , String surname , double salary)
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
    
    public double calculateIncome()
    {
        return salary;
    }
    
    

    
    
    
    
    
    
}
