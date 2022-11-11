package level1;

import java.util.Arrays;

public class test10 {
    public static void main(String[] args) {

        long n =118372;

        long answer = 0;
        String str = String.valueOf(n);

        char[] ch = str.toCharArray();
        char[] ch2 = new char[str.length()];

        Arrays.sort(ch);

        for(int i =0; i <ch.length; i++){
            ch2[i] = ch[ch.length-i-1];
        }
        String str2 = String.valueOf(ch2);

        answer = Long.parseLong(str2);

        System.out.println(answer);
    }
}
