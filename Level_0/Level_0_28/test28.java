package level0;

import java.util.Arrays;
import java.util.Collections;

public class test28 {

    public static void main(String[] args) {

        int answer = 0;
        String[] s1 ={"a","b","c"};
        String[] s2 = {"com","b","d","p","c"};

        for(int i =0; i<s1.length; i++){
            for(int j = 0 ; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }

        }
        System.out.println(answer);
    }
}
