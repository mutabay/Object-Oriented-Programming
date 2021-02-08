package ınheritance;

public class CommissionedEmployeee extends Employeee{
    
    private int item_Count ;
    private double item_Price;
    private double percent;

    public CommissionedEmployeee() {
        
        item_Count = 0;
        item_Price = 0;
        percent = 0;
    }
    
    public CommissionedEmployeee( int item_Count , double item_Price , double percent , String name , String surname , double salary)
    {
        super(name , surname , salary);
        
        this.item_Count = item_Count;
        this.item_Price = item_Price;
        this.percent = percent;
        
    }
    
    
    public void setItemCount( int item_Count)
    {
        this.item_Count = item_Count;
    }
    
    public void setItemPrice( double item_Price)
    {
        this.item_Price = item_Price ;
    }
    
    public void setPercent( double percent)
    {
        this.percent = percent;
    }
    
    public int getItemCount()
    {
        return item_Count;
    }
    
    public double getItemPrice()
    {
        return item_Price;
    }
    
    public double getPercent()
    {
        return percent;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + " ( Item Count : " + item_Count + "||| ITEM PRICE : " + item_Price + "||| Percent : " + percent + ")");
    }
    
    @Override
    public double calculateIncome()
    {
        return (super.calculateIncome() + item_Count * item_Price * percent);
    }
    
    
    
    
}
