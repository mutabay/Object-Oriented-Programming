
package ınheritance;


public class SimpleEmployeee extends Employeee {
    
    public SimpleEmployeee()
    {
        super();
    }
    
    public SimpleEmployeee(String name , String surname , double salary)
    {
        super(name, surname, salary);
    }
    
    @Override
    public String toString()
    {
        return ( super.toString() + "Simple Employee" );
    }
}
