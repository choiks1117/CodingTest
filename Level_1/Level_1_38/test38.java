package level1;


import java.util.ArrayList;
import java.util.Collections;

public class test38 {
    public static void main(String[] args) {

        int answer = 0;
        String s ="one4seveneight";

        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i =0; i< 10; i++){
            s = s.replace(str[i], Integer.toString(i));
        }
        answer = Integer.valueOf(s);

        System.out.println(answer);
    }
}
