   interface Vehicle{
    void start();
    void stop();

}
class Car implements Vehicle{

 public void start()
 {
    System.out.println("Started");
  }

  public void stop(){
    System.out.println("Stooped");
  }

 }


public class Interface_example
 {
      public static void main(String[] args) {
         Vehicle obj;
    
        obj = new Car();
        obj.start();
        obj.stop();
    }
    
   

 }

