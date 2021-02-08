package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee --> " + employee);
        
        System.out.println("------------------------");
        
        GeneralManager manager = new GeneralManager(10000, 0.1, "Zeynep", "Öztürk", 2021);
        System.out.println("Manager --> " + manager);
        System.out.println("Manager's income : " + manager.calculateIncome());
        
        System.out.println("------------------------");
        
        CommissionedEmployee commissioned = new CommissionedEmployee(100, 10, 0.2, "Ege", "Yeşil", 2021);
        System.out.println("Commissioned --> " + commissioned);
        System.out.println("Commissioned Employee's income : " + commissioned.calculateIncome());
    }    
}
