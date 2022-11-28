package level1;


import java.util.ArrayList;
import java.util.List;

public class test31 {
    public static void main(String[] args) {

        int[] arr ={1,1,3,3,0,1,1};

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1 ; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);


        }
    }
}
