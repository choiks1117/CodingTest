package level0;

import java.util.Arrays;

public class test34 {

    public static void main(String[] args) {

        int[] array ={1,8,3};
        int[] answer = new int[2];

        int a = Arrays.stream(array).max().getAsInt();
        int cnt=0;

        for(int i=0; i<array.length; i++){
            if(array[i]!=a){
                cnt++;
            }else{
                break;
            }
            //answer[1] = array[i]!=a ? cnt++ : 0;
        }
        answer[0] = a;
        answer[1] = cnt;

        System.out.println(answer[0]+","+answer[1]);

    }
}
