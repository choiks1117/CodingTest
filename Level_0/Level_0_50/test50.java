package level0;

import java.util.Arrays;

public class test50 {

    public static void main(String[] args) {

        int answer = 0;
        int num=29183;
        int k = 1;

        String str = num+"";
        answer = str.indexOf(String.valueOf(k))+1;
        if(answer==0){
            answer = -1;
        }
        System.out.println(answer);
    }
}
