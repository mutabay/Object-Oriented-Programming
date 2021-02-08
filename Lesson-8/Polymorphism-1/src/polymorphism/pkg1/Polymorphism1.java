
package polymorphism.pkg1;

public class Polymorphism1 {
    
    
    public static void main(String[] args) {

//        final int EMPLOYEE_COUNT = 10;
//        final int EMPLOYEE_SİMPLE = 0;
//        final int EMPLOYEE_COMMISSIONED = 1;
//        final int EMPLOYEE_GENERAL = 2;
//        final int EMPLOYEE_TYPE_COUNT = 3;
//         
//        Employee[] employees = new Employee[10];//REFERANS ARRAYI OLUSTRURMA -ABSTRACTTA OBJECT OLUSTURULAMAZ REFERANS OLUSTURULUR
//         
//        GeneralManager generalManager = new GeneralManager(0.1, 5, "General", "Manager", 2010.5);
      CommissionedEmployee commissionedEmployee = new CommissionedEmployee(10, 10, 0.1, "Commissioned", "Employee", 1000);
            System.out.println( commissionedEmployee.PrintABC() );
//        SimpleEmployee simpleEmployee = new SimpleEmployee("Simple", "Employee",1500);
//         
//        int type;
//        
//        for (int i = 0; i < employees.length; ++i) {
//            type = (int) (Math.random() * EMPLOYEE_TYPE_COUNT);
//            if (EMPLOYEE_SİMPLE == type)
//                employees[i] = simpleEmployee;
//            else if (EMPLOYEE_GENERAL == type)
//                employees[i] = generalManager;
//            else if(EMPLOYEE_COMMISSIONED == type)
//                employees[i] = commissionedEmployee;
//               
//            
//        }//for
//        
//        for (int i = 0; i < employees.length ; ++i)
//        {
//            System.out.println(employees[i].toString() +"Income is ->" + employees[i].calculateIncome());
//        }
// 
            

        
    }
    
}
