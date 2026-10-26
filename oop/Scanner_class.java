import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    System.out.println("ENTER YOUR NAME:");
    String name= sc.nextLine();
    System.out.println("Name:" + name);

    
    System.out.println("ENTER YOUR Age:");
    int age= sc.nextInt();
    System.out.println("Age is:" + age);

    System.out.println("ENTER YOUR Salary:");
    double salary= sc.nextDouble();
    System.out.println("Salary of employee is:" + salary);
    
    System.out.println("Are you are developer:");
     boolean isdev= sc.nextBoolean();
     System.out.println("Are u developer:"+isdev);

    sc.close();

    }
}
