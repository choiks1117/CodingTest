package level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test17 {
    public static void main(String[] args) {

        int arr[] = {5,9,7,10};
        int divisor = 5;

        List<Integer> answer = new ArrayList<>();
        int count=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer.add(arr[i]);
                count++;
            }
        }
        if(count == 0){
            answer.add(-1);
        }

        Collections.sort(answer);

        for(int i =0; i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
}
