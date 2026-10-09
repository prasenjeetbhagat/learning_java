public class reverse_example_array {
    public static void main(String[] args) {
        
          int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        // 2. The reversal logic (Your exact code, properly formatted)
        while (start < end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // 3. Printing the reversed array
        for (int num : arr) {
            System.out.println(num);
        }
    
}
}
