package level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test37 {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        int a=0;
        int b=0;
        int c=0;

        for(int i =0; i<commands.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int num=0;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];

            int[] arr = new int[b-a+1];

            for(int k = a-1 ; k < b ; k++){
                list.add(num , array[k]);
                num++;
            }
            Collections.sort(list);
            answer[i]=list.get(c-1);
        }

        for (int i =0; i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
