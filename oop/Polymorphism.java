public class Polymorphism { 
    public static void main(String[] args) { 
        Calculator obj = new Calculator(); 
        
        System.out.println(obj.add(20, 30)); 
        // Fixed: Removed invalid named argument syntax 'b:' and 'c:'
        System.out.println(obj.add(10, 10, 10)); 
        // This calls the double version because 2 and 3 fit into double, 
        // but if you want integers, it will default to the closest match or int.
        System.out.println(obj.add(2, 3)); 
    } 
} 
//method overloading..............
//......................................
class Calculator { 
    // Fixed: Added missing return statement
    public int add(int a, int b) { 
        int result = a + b; 
        return result; 
    } 

    public int add(int a, int b, int c) { 
        return a + b + c; 
    } 

    public double add(double a, double b) { 
        return a + b; 
    } 
}
//method overiding  
