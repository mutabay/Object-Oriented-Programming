
package jobassignment;

public class CommissionedEmployee extends Employee{
    
    private int item_Count;
    private double item_Price;
    private double percent;

    public CommissionedEmployee() {
        
        super();
        item_Count = 0;
        item_Price = 0;
    }

    public CommissionedEmployee(int item_Count, double item_Price, double percent, String name, String surname, double salary) {
        super(name, surname, salary);
        this.item_Count = item_Count;
        this.item_Price = item_Price;
        this.percent = percent;
    }
    
    public int getItem_Count() {
        return item_Count;
    }

    public void setItem_Count(int item_Count) {
        this.item_Count = item_Count;
    }

    public double getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(double item_Price) {
        this.item_Price = item_Price;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +" CommissionedEmployee{" + "item_Count=" + item_Count + ", item_Price=" + item_Price + ", percent=" + percent + '}';
    }

    @Override
    public double calculateIncome() {
        return super.calculateIncome() + (item_Count * item_Price * percent );
    }
    
    
    

    
    
    
}
