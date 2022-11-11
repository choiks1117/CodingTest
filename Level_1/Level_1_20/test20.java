package level1;


import java.util.ArrayList;
import java.util.List;

public class test20 {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,6,7,8,0};
        int answer = 45;
        for(int i =0; i<numbers.length;i++){
            answer -= numbers[i];
        }

        System.out.println(answer);
    }
}
