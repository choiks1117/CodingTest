package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test45 {

    public static void main(String[] args) {

        int n=20;
        int answer = 0;

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
