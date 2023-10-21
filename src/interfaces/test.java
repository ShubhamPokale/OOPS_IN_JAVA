package interfaces;

public class test {

    public static int binary_to_decimal(String str) {
        // Code here
        int i = Integer.parseInt(str);
        int val = 0;
        while (i > 0) {
            //10001000
            int base = 1;
            val = 0;
            int last_digit = i % 10;  //10001000 0
            val = val + (last_digit * base); // o x 1
            i = i / 10;     // 1000100
            base = base * 2;  // 2


        }

        return val;
    }



    public static void main(String[] args) {
        String s="101";
        int x= (int) (s.charAt(s.length()-1));
        int y = Integer.parseInt(s);
        System.out.println(y);
        // String to int
                //String to char
                    //


        System.out.println(binary_to_decimal("1001101"));
       // System.out.println(x) ;
    }
}
