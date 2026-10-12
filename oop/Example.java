 class Dog{
  
  String name ="Rocky ";
  void bark(){
    System.out.println(name+ "Bark");
  }

 } 



public class Example {
    
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();

        Dog rocky =new Dog();
        rocky.name="Rocky";
        rocky.bark();
     
    }
}