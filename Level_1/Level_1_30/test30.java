package level1;


import java.util.Scanner;

public class test30 {
    public static void main(String[] args) {

        int[] answer = new int[2];
        int n = 3;
        int m = 12;
        int max=Math.max(n,m);
        int min =Math.min(n,m);

        for(int i=1; i<=min ; i++){
            if(min%i==0&&max%i==0){
                answer[0]=i;
            }
        }

        for(int i =1; i<=max; i++){
            if((max*i)%min==0){
                answer[1]=max*i;
                break;
            }
        }

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);


        }
    }
}
