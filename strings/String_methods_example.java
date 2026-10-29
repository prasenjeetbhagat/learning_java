package strings;

public class String_methods_example {
    public static void main(String[] args) {
        String name="Prasenjeet";
      System.out.println(name.charAt(0));
     
      System.out.println(name.substring(2));
      System.out.println(name.replace('a','o'));
      System.out.println(name.startsWith("tr"));
      System.out.println(name.equals("Prasenjeet"));
      
       String s ="Prasenjet in class";
      String[] arr=s.split("");
      for (String str: arr)
        {
        System.out.println(str);
        }
      

    }
}
