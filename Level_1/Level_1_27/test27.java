package level1;


import java.util.ArrayList;
import java.util.List;

public class test27 {
    public static void main(String[] args) {

        int price=3;
        int money=20;
        int count =4;
        long answer=0;

        for(int i =1;i<=count;i++){
            answer += price*i;
        }
        answer = money - answer;
        answer = answer>0 ? 0 : answer*-1;

        System.out.println(answer);
    }
}
