package level0;

import java.util.Arrays;

public class test49 {

    public static void main(String[] args) {

        String my_string="Bcad";
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
}
