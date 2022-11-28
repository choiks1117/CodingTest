package level1;


import java.util.Arrays;

public class test34 {
    public static void main(String[] args) {

        int answer = 0;
        int d[] = {1,3,2,5,4};
        int budget = 9;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            if(budget>=0){
                budget -= d[i];
                answer++;
            }
        }
        if(budget<0){
            answer--;
        }

        System.out.println(answer);
    }
}
