
package jobassignment;


public class GeneralManager extends Employee{
    
    private double percent;
    private int profit;

    
    
    public GeneralManager() {
        
        super();
        percent = 0;
        profit = 0;
        
    }

    public GeneralManager(double percent, int profit, String name, String surname, double salary) {
        super(name, surname, salary);
        this.percent = percent;
        this.profit = profit;
    }
    
    
    

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "GeneralManager{" + "percent=" + percent + ", profit=" + profit + '}';
    }

    @Override
    public double calculateIncome() {
        
        return super.calculateIncome() + (profit * percent); 
    }
    
    
    
    
}
