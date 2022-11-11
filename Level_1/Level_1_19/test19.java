package level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test19 {
    public static void main(String[] args) {

        int[] absolutes ={4,7,12};
        boolean[] signs ={true,false,true};
        int answer = 0;
        int[] arr = absolutes.clone();
        List<Integer> list = new ArrayList<>();

        for(int i =0; i<absolutes.length; i++){
            if(signs[i] == false){
                list.add(absolutes[i] * -1);
            }else if(signs[i]==true){
                list.add(absolutes[i]);
            }
        }

        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }

        System.out.println(answer);
    }
}
