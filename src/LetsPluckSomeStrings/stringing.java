package LetsPluckSomeStrings;
import java.util.*;
public class stringing {

//    public static void main(String[] args) {
//
//    }
    public static StringBuffer reverseString(String s){
        // code here
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        return str;

    }



static void ConvertToBin(long x)
    {
        long  xx = x;

        String bin = "";

        while (x != 0)
        {
            bin += (char)((x & 1) + '0');
            x >>= 1;
        }
        StringBuffer ans = new StringBuffer(bin);
        ans = ans.reverse();
        System.out.println(ans);
    }

static void isPalindorme(String inputstring)
    {

        StringBuffer str1 = new StringBuffer(inputstring);
        StringBuffer str2 = new StringBuffer(inputstring);

        str2.reverse();

        if(str1.toString().equals(str2.toString()))
            {
                System.out.println("The given string is a Palindrome");
            }
        else
            {
                System.out.println("The given string is not a Palindrome");
            }
    }



    public static void main(String[] args)
    {

//        String str = "Sandeep Jain";
//        str.concat(" Founder of Gfg");
//        System.out.println("str refers to " + str);
//
//
//
//
//        String s1 = "java";
//        s1.concat(" rules");
//
//        // Yes, s1 still refers to "java"
//        System.out.println("s1 refers to " + s1);
//


        isPalindorme("qwertyytrewq");
        isPalindorme("Phineas");
        ConvertToBin(34);

        System.out.println(reverseString("Harry Potter"));
    }







}
