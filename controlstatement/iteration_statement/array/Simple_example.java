import java.util.Scanner;

public class Simple_example {
    public static void main(String[] args) {
        // First Syntax for defining array
        // int[] marks=new int[4];
        // marks[0]=50; //CSAT
        // marks[1]=100; //GS
        // marks[2]=1000; //mains
        // marks[3]=196; //Personality test

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        // second Syntax for defining array
        // int numbers[]={97,98,99,100};

        // for(int i=0;i<4;i++){
        // System.out.println(numbers[i]);
        // }

        // Third Syntax for defining array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}