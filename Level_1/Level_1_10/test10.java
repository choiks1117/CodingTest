package level1;

public class test10 {
    public static void main(String[] args) {
        int x =2, n =5;
        long[] answer = new long[n];

        answer[0] = x;
        for(int i =1; i<n ; i++){
            answer[i] = answer[i-1]+x;
        }


        for(int i =0 ; i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
