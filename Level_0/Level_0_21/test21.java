package level0;

import java.util.Arrays;

public class test21 {

    public static void main(String[] args) {
        int answer = 0;
        int price = 150000;

        if(price>=500000){
            answer = (price*80)/100;
        }else if(price>=300000){
            answer = (price*90) / 100;
        }else if(price>=100000){
            answer = (price*95) / 100;
        }else{
            answer = price;
        }
        System.out.println(answer);
    }

}
