
package polymorphism.pkg1;


public class SimpleEmployee extends Employee {
    
    public SimpleEmployee()
    {
        super();
    }
    
    public SimpleEmployee(String name , String surname , double salary)
    {
        super(name, surname, salary);
    }
    
    @Override
    public String toString()
    {
        return ( super.toString() + "Simple Employee" );
    }
    
    @Override
    public double calculateIncome()
    {
        return getSalary();
    }
}
