public class Stringbuffer{


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prasenjeet ");
        // //append
        // sb.append("Bhagat");
        // System.out.println(sb);

        // //insert
        // sb.insert(0,"senjeet ");
        // System.out.println(sb);
        // //replace

        // sb.replace(6,12,"Priyadarshani");
        // System.out.println(sb);

        // //delete
        // sb.delete(0, 3);
        // System.out.println(sb);     


       //reverse
     System.out.println(sb.reverse());
       System.out.println(sb.length());
       System.out.println(sb.capacity());
    //charat
       System.out.println(sb.charAt(0)); 


     //setcharat
       sb.setCharAt(4,'E');
       System.out.println(sb);

     //ensure Capacity ..
       sb.ensureCapacity(50);
       System.out.println(sb.capacity());

       //trim to size
       sb.trimToSize();
       System.out.println(sb.capacity());




    }
}