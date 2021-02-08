
package ınheritance;
public class Inheritance {

    public static void main(String[] args) {
        
        Employeee employee = new Employeee(" Ahmet "," Çilingir ", 2000.0);
        
        System.out.println(employee);
        System.out.println(employee.calculateIncome());
        
        System.out.println("----------------------------------------");
        
        SimpleEmployeee simpleE = new SimpleEmployeee("Oliver", "QUEEN", 1500.0);
        System.out.println(simpleE);
        System.out.println(simpleE.calculateIncome());
        
        
        System.out.println("----------------------------------------");
        
        GeneralManager manager = new GeneralManager(0.005, 1000, "Necmi", "Kesik", 2000.0);
        System.out.println(manager);
        System.out.println(manager.calculateIncome());
        
        
        System.out.println("----------------------------------------");
        
        CommissionedEmployeee commissioner = new CommissionedEmployeee(100, 10, 0.001, "Kilimcinin", "Oğlu", 1500.0);
        System.out.println(commissioner);
        System.out.println(commissioner.calculateIncome());
        

    }
    
}
