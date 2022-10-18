public class q1 {

    public static void main(String args[])
    {
        String str1 = "abcdefghihihih";
        String str2 = "abcdefff";

        int small_length = str1.length()<str2.length()?str1.length():str2.length();// storing smaller lenth in this variable
        int bigger_string = str1.length()<str2.length()?2:1; // if both the strings are same but length not same


        for (int i = 0 ; i<small_length ; i++)
        {
            if(str1.charAt(i) !=str2.charAt(i))
            {
                if(((int)str1.charAt(i)) - ((int)str2.charAt(i))>0)
                {
                    // true means that unicode value of char of str1 was greater hence lexically str1 should come after str2
                    bigger_string = 1; 
                }else{
                    bigger_string = 2;
                }
                break ;
            }
        }

        System.out.println(bigger_string == 1?str2:str1);
        System.out.println(bigger_string == 2?str2:str1);

        
    }    
}