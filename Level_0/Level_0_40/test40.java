package level0;

public class test40 {

    public static void main(String[] args) {

        int n=12;
        int answer = 0;
        int sum =0;
        int count =0;

        for(int i = 1 ; i<= n; i++){
            if(n % i == 0 ){

                answer += i;
            }
        }
        System.out.println(answer);
    }
}
