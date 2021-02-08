package inheritance;

public class GeneralManager extends Employee {
    private int profit;
    private double percent;

    public GeneralManager() {
        super();
        profit = 0;
        percent =0;
    }

    public GeneralManager(int profit, double percent, String name, String surname, double salary) {
        super(name, surname, salary);
        this.profit = profit;
        this.percent = percent;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }    

    @Override
    public String toString() {
        return super.toString() + "\n" + "GeneralManager{" + "profit=" + profit + ", percent=" + percent + '}';
    }

    @Override
    public double calculateIncome() {
        return super.calculateIncome() + (profit * percent);
    }
    
    
    
}
