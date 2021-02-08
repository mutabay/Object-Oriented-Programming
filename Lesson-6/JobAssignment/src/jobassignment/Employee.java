
package jobassignment;



public class Employee {
    
    private String name ;
    private String surname;
    private double salary;

    public Employee() {
        name = "UNKNOWN";
        surname = "UNKNOWN";
        salary = 0.0;
        System.out.println("DEFAULT CONST.");
    }
    
    public Employee(String name, String surname, double salary) {
        System.out.println("PARAMETRIC CONST.");
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + '}';
    }
    
    
    public double calculateIncome()
    {
        return salary;
    }
    
    
    
    
    
    
    
}
