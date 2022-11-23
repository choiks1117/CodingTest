package level1;


import java.util.ArrayList;
import java.util.List;

public class test26 {
    public static void main(String[] args) {

        int left = 13;
        int right = 17;
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int count=0;
        int count2=0;

        for(int i =left; i<=right; i++){
            list.add(i);
        }
        for(int i=0; i<list.size(); i++){
            for(int j=1; j<=list.get(i); j++){
                if(list.get(i)%j==0){
                    count++;
                }
            }
            answer = count%2==0 ? answer + list.get(i) : answer - list.get(i) ;
            count=0;
        }

        System.out.println(answer);
    }
}
