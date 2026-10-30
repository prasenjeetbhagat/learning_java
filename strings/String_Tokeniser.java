import java.util.StringTokenizer;

public class String_Tokeniser {
    public static void main(String [] args){
        String str="Java Dotnet C C#";
        StringTokenizer st= new StringTokenizer(str);

         while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
         }

    }
}
