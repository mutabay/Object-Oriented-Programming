package inheritance;

public class CommissionedEmployee extends Employee {
    private int itemCount;
    private int itemPrice;
    private double percent;

    public CommissionedEmployee() {
        super();
        itemCount = 0;
        itemPrice = 0;
        percent = 0;
    }

    public CommissionedEmployee(int itemCount, int itemPrice, double percent, String name, String surname, double salary) {
        super(name, surname, salary);
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.percent = percent;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "CommissionedEmployee{" + "itemCount=" + itemCount + ", itemPrice=" + itemPrice + ", percent=" + percent + '}';
    }

    @Override
    public double calculateIncome() {
        return super.calculateIncome() + (itemCount * itemPrice * percent);
    }
    
    
    
    
    
}
