import java.util.Arrays;

public class q3 {

    public static void main(String args[])
    {
        String s1="harsh";

        char temp[]=s1.toCharArray();
        Arrays.sort(temp);
        s1=new String(temp);
        System.out.println(s1);


    }
    
}
