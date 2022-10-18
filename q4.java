import java.util.Scanner;
public class q4 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt(); // converting it into int
        System.out.println(num);
        while(num != 1 )
        {
            if(num%2 == 0) // if num ==even
            {
                num = num/2;
            }else{  // if num == odd
                num = num*3 +1; 
                
            }
            System.out.println(num);
        }

    }
    
}
