package ınheritance;

public class GeneralManager extends Employeee {
    
    private double percent;
    private int profit;
    
    
    public GeneralManager()
    {
       super();
       percent = 0;
       profit = 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public GeneralManager ( double percent , int profit , String name, String surname , double salary )
    {
        super (name , surname, salary);
        this.percent = percent;
        this.profit = profit;
        
    }
    
    public void setPercent(double percent)
    {
        this.percent = percent;
    }
    
    public void setProfit(int profit)
    {
        this.profit = profit;
    }
    
    public double getPercent()
    {
        return percent;
    }
    
    public int getProfit()
    {
        return profit;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + "General Maganer ( percent : " + percent + "||| profit : " + profit);
    }
    
    @Override
    public double calculateIncome()
    {
        return (super.calculateIncome() + percent * profit );
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
