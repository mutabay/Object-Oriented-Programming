
package jobassignment;

public class JobAssignment {

    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println("Employee --->" + employee);
        
        System.out.println("-----------------------------------------------------");
        
        GeneralManager manager = new GeneralManager(0.1 , 10000 , "Zeynep" , "Öztürk" , 2021);
        System.out.println("Manager ---->" + manager);
        System.out.println("Manager's imcome : " + manager.calculateIncome());
        
        System.out.println("-----------------------------------------------------");
        
        CommissionedEmployee commissioned = new CommissionedEmployee(100, 10, 0.2, "Ege", "Yeşil", 1500);
        System.out.println("Commissioned ---->" + commissioned);
        System.out.println("Commissioned's imcome : " + commissioned.calculateIncome());
        

    }
    
}
