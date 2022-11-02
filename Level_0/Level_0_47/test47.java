package level0;

import java.util.Scanner;

public class test47 {

    public static void main(String[] args) {

        String answer = "";
        String my_string="cccCCC";
        char[] ch = my_string.toCharArray();
        for(int i=0; i<ch.length; i++){

            if(Character.isLowerCase(ch[i])){
                ch[i]-=32;
            }else{
                ch[i]+=32;
            }
            answer += ch[i];
        }
        System.out.println(answer);
    }
}
