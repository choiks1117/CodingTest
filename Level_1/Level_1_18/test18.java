package level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test18 {
    public static void main(String[] args) {

        int[] arr={4,3,2,1};
        int[] answer;
        int temp=0;
        List<Integer> list = new ArrayList<>();

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        temp = arr2[0];

        for(int i =0; i<arr.length; i++){
            if(temp != arr[i]){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            for(int i =0; i<list.size();i++){
                answer[i] = list.get(i);
            }
            
        }

        for(int i =0; i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
