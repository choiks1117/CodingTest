package level0;

import java.util.ArrayList;
import java.util.List;

public class test42 {

    public static void main(String[] args) {

        int n = 24;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();

        System.out.println(answer);
    }
}
