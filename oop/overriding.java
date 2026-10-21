// public class Polymorphism { 
//     public static void main(String[] args) { 
//         Calculator obj = new Calculator(); 
        
//         System.out.println(obj.add(20, 30)); 
//         // Fixed: Removed invalid named argument syntax 'b:' and 'c:'
//         System.out.println(obj.add(10, 10, 10)); 
//         // This calls the double version because 2 and 3 fit into double, 
//         // but if you want integers, it will default to the closest match or int.
//         System.out.println(obj.add(2, 3)); 
//     } 
// } 
// //method overloading..............
// //......................................
// class Calculator { 
//     // Fixed: Added missing return statement
//     public int add(int a, int b) { 
//         int result = a + b; 
//         return result; 
//     } 

//     public int add(int a, int b, int c) { 
//         return a + b + c; 
//     } 

//     public double add(double a, double b) { 
//         return a + b; 

//     } 
// }

//method overiding

public class overriding {
    

public static void main(String[] args) {
    FullTimeemployee obj = new  FullTimeemployee();
    obj.baseSalary = 1000;
    obj.name ="Mansur";
    obj.bonus=300.00;
    obj.calculateSalary(); 
    obj.ShowDeatils();
    
}
}

class employee{
    String name;
    double baseSalary;


    //method to calculate salary (can be overriding)
    public double calculateSalary() {
        return baseSalary;//defult logic
    }

    public void ShowDeatils(){
        System.out.println("Employee: "+name + ",Salary: " + calculateSalary());
    }
}

class FullTimeemployee extends employee{
    double bonus;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return baseSalary + bonus;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("FullTimeEmployee: "+name + ",Salary: " + calculateSalary());
    }
}

class partTimeemployee extends employee{
    int hoursworked;
    double hourlyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return hoursworked * hourlyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("part-time Employee: "+name + ",Salary: " + calculateSalary());
    }
}


class temperoryemployee extends employee{
    int dayssworked;
    double dailyyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return dayssworked * dailyyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("temperory Employee: "+name + ",Salary: " + calculateSalary());
    }
}
