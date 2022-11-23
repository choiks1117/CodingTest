package level1;


import java.util.Arrays;

public class test24 {
    public static void main(String[] args) {

        String s ="Zbcdefg";
        String answer = "";

        char[] ch = s.toCharArray();
        char[] ch2 = ch.clone();
        Arrays.sort(ch);

        for(int i=0; i<ch.length;i++){
            ch2[i] = ch[ch.length-i-1];
        }
        answer = String.valueOf(ch2);

        System.out.println(answer);
    }
}
