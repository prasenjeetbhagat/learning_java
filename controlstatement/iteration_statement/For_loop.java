public class For_loop {
    public static void main(String[] args){
        //simple for loop to print numbers from 1 to 10
    for (int i=1;i<=10;i++)
        System.out.println(i);
    
    //for loop to print the multiplication table of 7
        for (int i=1;i<=10;i++){
            System.out.println(i*7);
        }
        //while loop to print 5 table

        int a=5;
        while(a<=50){
         System.out.println(a);
         a+=5;
            
        }


        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        // do while loop
        // }while(condition);




     //Pyramid of '*'
              //   * *
              //   * * *
              //   * * * *
              //   * * * * *
  
        int n=5;
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }




           //jump statements in java
        for (int i=1;i<=5;i++){
            if (i == 4) {
                continue; // Skip the rest of the loop body for i == 4
            }
            System.out.println(i);
        }




//     //Array declaration and initialization
//     // First technique
        
    int[] numbers ={1,2,3,4,5};



//     //second one technique
    int arr[]=new int[5];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    arr[4]=50;
    System.out.println(arr.length);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
 }
    
    // third technique
    for(int num: arr){
        System.out.println(num);
    }
//print the reverse of an array
 
    int start =0;
    int end =arr.length-1;
    while (start<end) { 
     int temp =arr[start];
     arr[start] =arr[end];
     arr[end]=temp;
     start++;
      end--;

    }
     for(int num: arr){
        System.out.println(num);
    }
    

}
}

